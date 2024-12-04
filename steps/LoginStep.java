package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.Contacts.ContactsPage;
import pages.HomePage;
import pages.LoginPage;


public class LoginStep {

    private LoginPage loginPage;
    private ContactsPage contactsPage;
    private HomePage homePage;

    public LoginStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        contactsPage = new ContactsPage(driver);
    }

    @Step("Войдите в приложение с действительными данными - имя пользователя: {userName}, пароль: {password}.")
    public HomePage login(String userName, String password) {
        loginPage.open();
        return loginPage.login(userName, password);
    }
}