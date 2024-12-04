package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import steps.ContactStep;
import tests.base.BaseTest;

import static dto.ContactFactory.getContact;

public class ContactsTest extends BaseTest {

    protected ContactStep contactStep;

    @BeforeMethod
    public void setUp() {
        contactStep = new ContactStep(driver);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @Override
    public BasePage open() {
        return null;
    }

    @Test(testName = "Создание нового контакта",
            description = "Проверка, что новый контакт может быть создан с валидными данными")
    @Description("Создание нового контакта с корректными данными")
    public void checkCreateContact() {
        loginPage.open()
                .login("tborodich@tms.sandbox", "Password001")
                .open()
                .selectMenuOption("Contacts");
        contactStep.create(getContact("Dr.", "Web", "Tertiary"));
        contactStep.waitForPageLoaded(driver);
        contactStep.checkCreateContact();
    }
}