package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

@Log4j2
public class LoginStep {

    private LoginPage loginPage;

    public LoginStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    @Step("Войдите в приложение с действительными данными - имя пользователя: {userName}, пароль: {password}.")
    public void login() {
        log.info("Starting login process");
        loginPage.open()
                .isPageOpened()
                .login("tborodich@tms.sandbox", "Password001")
                .open();
        log.info("Login process completed");
    }
}
