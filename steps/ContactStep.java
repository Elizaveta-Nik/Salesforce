package steps;

import dto.Contact;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Contacts.ContactsPage;
import pages.Contacts.NewContactModal;
import pages.HomePage;

import java.time.Duration;
import java.util.Objects;

public class ContactStep {

    HomePage homePage;
    ContactsPage contactsPage;
    NewContactModal newContactModal;

    public ContactStep (WebDriver driver) {
        homePage = new HomePage(driver);
        contactsPage = new ContactsPage(driver);
        newContactModal = new NewContactModal(driver);
    }

    @Step()
    public void create(Contact contact) {
        contactsPage.clickOnActionButton("New");
        newContactModal.createContact(contact);
        newContactModal.clickButton("Save");
    }

    public void waitForPageLoaded(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return Objects.requireNonNull(((JavascriptExecutor)driver).executeScript("return document.readyState"))
                        .toString().equals("complete");
            }
        });
    }

    @Step("Проверка создания контакта")
    public void checkCreateContact(){
        boolean isAccountCreated = contactsPage.contactCreated();
        Assert.assertTrue(isAccountCreated,
                "Сообщение об удачно созданном контакте не отображается.");
    }
}
