package tests;

import dto.Contact;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static dto.ContactFactory.getContact;

@Log4j2
public class ContactsTest extends BaseTest {

    @Test(testName = "Create a new contact",
            description = "Verify that a new contact can be created with valid data")
    @Description("Creating a new contact with valid data")
    public void checkCreateContact() {
        log.info("Starting test: Create a new contact");

        loginStep.login();
        log.info("Logged into the system");

        Contact newContact = getContact("Dr.", "Web", "Tertiary");

        contactStep.create(newContact);
        log.info("Contact created");

        boolean isContactCreated = contactsPage.contactCreated();
        log.info("Contact creation verification: {}", isContactCreated);

        Assert.assertTrue(isContactCreated, "Contact was not created.");
        log.info("Test completed: Create a new contact");
    }
}
