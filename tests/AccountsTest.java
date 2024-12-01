package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.time.Duration;

public class AccountsTest extends BaseTest {

    String user = "tborodich@tms.sandbox";
    String password = "Password001";

    @Test
    @Description("Создание нового аккаунта с полностью заполненными полями.")
    public void checkCreateAccount() {
        loginPage.open();
        loginPage.login(user, password);
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");

        newAccountModal.createAccount("Veta-4", "Hot", "375-29-169-88-17", "1234555",
                "1223", "https://www.onliner.by/", "https://www.onliner.by/",
                "45", "Customer - Channel", "Subsidiary", "Banking", "8671",
                "1000000000", "#47", "Majakovskogo", "Minsk", "Belarus",
                "11111", "Belarus", "Kozlova", "Minsk", "Belarus",
                "222222", "Belarus", "High", "Platinum", "21.01.2021",
                "#101", "1", "Maybe", "Yes", "Wow");
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='activityTab__item']")));
    }
}