package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pages.Contacts.Address;
import pages.Contacts.Contact;
import tests.base.BaseTest;

import java.time.Duration;

public class ContactsTest extends BaseTest {

    String user = "tborodich@tms.sandbox";
    String password = "Password001";

    @Test
    @Description("Создание нового контакта с полностью заполненными полями.")
    public void checkCreateContact() {
        loginPage.open();
        loginPage.login(user, password);

        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Contact/new");

        // Создание адресов
        Address mailingAddress = new Address();
        mailingAddress.setStreet("Kropotkina");
        mailingAddress.setCity("Minsk");
        mailingAddress.setState("Belarus");
        mailingAddress.setZip("22203");
        mailingAddress.setCountry("Belarus");

        Address otherAddress = new Address();
        otherAddress.setStreet("Kozlova");
        otherAddress.setCity("Grodno");
        otherAddress.setState("Belarus");
        otherAddress.setZip("22200");
        otherAddress.setCountry("Belarus");

        // Создание контакта
        Contact contact = new Contact();
        contact.setSalutation("Dr.");
        contact.setFirstName("Alex");
        contact.setLastName("Spot");
        contact.setPhone("8-029-111-22-33");
        contact.setHomePhone("8-017-222-22-00");
        contact.setMobile("8-029-111-22-33");
        contact.setOtherPhone("8-029-222-11-33");
        contact.setFax("8-017-222-22-00");
        contact.setTitle("Merci");
        contact.setDepartment("Chemistry");
        contact.setBirthdate("11.01.1991");
        contact.setEmail("ku-ku@gmail.com");
        contact.setAssistant("John Doe");
        contact.setLeadSource("Phone Inquiry");
        contact.setAsstPhone("8-029-888-77-66");
        contact.setMailingAddress(mailingAddress);
        contact.setOtherAddress(otherAddress);
        contact.setLanguages("German");
        contact.setLevel("Tertiary");
        contact.setDescription("Wow");

        newContactModal.createAccount(contact);
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='activityTab__item']")));
    }
}
//    @Test
//    @Description("Создание нового контакта с полностью заполненными полями.")
//    public void checkCreateContact(@Optional("tborodich@tms.sandbox") String user, @Optional("Password001") String password) {
//        loginPage.open();
//        loginPage.login(user, password);
//
//        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Contact/new");
//        newContactModal.createAccount("Dr.", "Alex", "Spot", "8-029-111-22-33",
//                "8-017-222-22-00", "8-029-111-22-33", "8-029-222-11-33", "8-017-222-22-00",
//                "Merci", "Chemistry", "11.01.1991", "ku-ku@gmail.com", "John Doe",
//                "Phone Inquiry", "8-029-888-77-66", "Kropotkina", "Minsk",
//                "Belarus", "22203", "Belarus", "Kozlova", "Grodno",
//                "Belarus", "22200", "Belarus", "German", "Tertiary",
//                "Wow");
//        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='activityTab__item']")));
//    }
//}