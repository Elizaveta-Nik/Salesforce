package steps;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Accounts.AccountsPage;
import pages.Accounts.NewAccountModal;
import pages.HomePage;

import java.time.Duration;
import java.util.Objects;

public class AccountStep {

    private final HomePage homePage;
    private final AccountsPage accountsPage;
    private final NewAccountModal newAccountModal;
    private final WebDriverWait wait;

    public AccountStep(WebDriver driver) {
        homePage = new HomePage(driver);
        accountsPage = new AccountsPage(driver);
        newAccountModal = new NewAccountModal(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Step("Создание нового аккаунта")
    public void create(Account account) {
        System.out.println("Создание нового аккаунта: " + account.getAccountName());
        accountsPage.clickOnActionButton("New");
        newAccountModal.createAccount(account);
        newAccountModal.clickButton("Save");
    }

    public void waitForPageLoaded(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return Objects.requireNonNull(((JavascriptExecutor)driver).executeScript("return document.readyState"))
                        .toString().equals("complete");
            }
        });
    }

    @Step("Проверка создания аккаунта")
    public void checkCreateAccount(){
        boolean isAccountCreated = accountsPage.accountCreated();
        Assert.assertTrue(isAccountCreated,
                "Сообщение об удачно созданном аккаунте не отображается.");
    }
}
