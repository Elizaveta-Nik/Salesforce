package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By USERNAME_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    @Step("Открытие 'Login page'")
    public LoginPage open() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com/");
        return this;
    }

    @Step("Войдите в приложение с действительными данными - имя пользователя: {userName}, пароль: {password}.")
    public HomePage login(String userName, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}

//    @Override
//    public LoginPage open() {
//        driver.get("https://tms9-dev-ed.develop.my.salesforce.com/"); // Замените на URL вашей страницы
//        return isPageOpened();
//    }


//    private final By USER_INPUT = By.id("username");
//    private final By PASSWORD_INPUT = By.id("password");
//    private final By LOGIN_BUTTON = By.id("Login");
//
//    public LoginPage(WebDriver driver) {
//        super(driver);
//    }
//
//    @Step("Открытие страницы логина")
//    public LoginPage open() {
//        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
//        return this;
//    }
//
//    @Step("Вход в систему с логином {user} и паролем {password}")
//    public HomePage login(String user, String password) {
//        driver.findElement(USER_INPUT).sendKeys(user);
//        driver.findElement(PASSWORD_INPUT).sendKeys(password);
//        driver.findElement(LOGIN_BUTTON).click();
//        return new HomePage(driver);
//    }
//}