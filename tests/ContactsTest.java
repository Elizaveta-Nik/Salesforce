package tests;

import dto.Contact;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static dto.ContactFactory.getContact;

public class ContactsTest extends BaseTest {

    @Test(testName = "Создание нового контакта",
            description = "Проверка, что новый контакт может быть создан с валидными данными")
    @Description("Создание нового контакта с корректными данными")
    public void checkCreateContact() {
        loginStep.login("tborodich@tms.sandbox", "Password001")
                .open()
                .selectMenuOption("Contacts");

        Contact newContact = getContact("Dr.", "Web", "Tertiary");

        contactStep.create(newContact);
        contactStep.checkCreateContact();
    }
}