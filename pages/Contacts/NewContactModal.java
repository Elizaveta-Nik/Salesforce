package pages.Contacts;

import dto.Contact;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import wrappers.Date;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

@Log4j2
public class NewContactModal extends BasePage {

    private final String BUTTON_PATTERN = "//lightning-button/button[text()='%s']";

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewContactModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-button/button[text()='New']")));
        return this;
    }

    @Override
    public NewContactModal open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Contact/new");
        return this;
    }

    @Step("Заполнение формы нового контакта корректными данными.")
    public NewContactModal createContact(Contact contact) {
        log.info("Creating contact '{}' '{}'", contact.getFirstName(),contact.getLastName());
        new Picklist(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Department").write(contact.getDepartment());
        new Date(driver, "Birthdate").write(contact.getBirthdate());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Picklist(driver, "Lead Source").select(contact.getLeadSource());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());

        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());

        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State/Province").write(contact.getOtherState());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZip());
        new Input(driver, "Other Country").write(contact.getOtherCountry());

        new Input(driver, "Languages").write(contact.getLanguages());
        new Picklist(driver, "Level").select(contact.getLevel());
        new TextArea(driver, "Description").write(contact.getDescription());

        return this;
    }

    @Step("Нажатие на кнопку: {buttonName}")
    public void clickButton(String buttonName) {
        By button = By.xpath(String.format(BUTTON_PATTERN, buttonName));
        driver.findElement(button).click();
        new ContactsPage(driver);
    }
}