package steps;

import dto.Contact;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Contacts.ContactsPage;
import pages.Contacts.NewContactModal;
import pages.HomePage;

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

    @Step("Проверка создания контакта")
    public void checkCreateContact(){
        boolean isAccountCreated = contactsPage.contactCreated();
        Assert.assertTrue(isAccountCreated,
                "Сообщение об удачно созданном контакте не отображается.");
    }
}