package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Accounts.AccountsPage;

public class HomePage extends BasePage {

    private final String MENU_OPTION_PATTERN = "//span[text()='%s']//ancestor::one-app-nav-bar-item-root[@role='listitem']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//img[@alt='User']//ancestor::button[@type='button']")));
        return this;
    }

    @Step("Открытие 'Home page'")
    public HomePage open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/page/home");
        return this;
    }

    @Step("Выбор опции {optionName} в строке меню.")
    public AccountsPage selectMenuOption(String optionName) {
        By setOption = By.xpath(String.format(MENU_OPTION_PATTERN, optionName));
        driver.findElement(setOption).click();
        return new AccountsPage(driver);
    }
}