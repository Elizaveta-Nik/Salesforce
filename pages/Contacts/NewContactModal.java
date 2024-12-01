package pages.Contacts;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import wrappers.Date;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewContactModal extends BasePage {

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    public void createAccount(Contact contact) {
        selectSalutation(contact.getSalutation());
        writeFirstName(contact.getFirstName());
        writeLastName(contact.getLastName());
        writePhone(contact.getPhone());
        writeHomePhone(contact.getHomePhone());
        writeMobile(contact.getMobile());
        writeOtherPhone(contact.getOtherPhone());
        writeFax(contact.getFax());
        writeTitle(contact.getTitle());
        writeDepartment(contact.getDepartment());
        writeBirthdate(contact.getBirthdate());
        writeEmail(contact.getEmail());
        writeAssistant(contact.getAssistant());
        selectLeadSource(contact.getLeadSource());
        writeAsstPhone(contact.getAsstPhone());
        writeMailingAddress(contact.getMailingAddress());
        writeOtherAddress(contact.getOtherAddress());
        writeLanguages(contact.getLanguages());
        selectLevel(contact.getLevel());
        writeDescription(contact.getDescription());
    }

    private void selectSalutation(String salutation) {
        new Picklist(driver, "Salutation").select(salutation);
    }

    private void writeFirstName(String firstName) {
        new Input(driver, "First Name").write(firstName);
    }

    private void writeLastName(String lastName) {
        new Input(driver, "Last Name").write(lastName);
    }

    private void writePhone(String phone) {
        new Input(driver, "Phone").write(phone);
    }

    private void writeHomePhone(String homePhone) {
        new Input(driver, "Home Phone").write(homePhone);
    }

    private void writeMobile(String mobile) {
        new Input(driver, "Mobile").write(mobile);
    }

    private void writeOtherPhone(String otherPhone) {
        new Input(driver, "Other Phone").write(otherPhone);
    }

    private void writeFax(String fax) {
        new Input(driver, "Fax").write(fax);
    }

    private void writeTitle(String title) {
        new Input(driver, "Title").write(title);
    }

    private void writeDepartment(String department) {
        new Input(driver, "Department").write(department);
    }

    private void writeBirthdate(String birthdate) {
        new Date(driver, "Birthdate").write(birthdate);
    }

    private void writeEmail(String email) {
        new Input(driver, "Email").write(email);
    }

    private void writeAssistant(String assistant) {
        new Input(driver, "Assistant").write(assistant);
    }

    private void selectLeadSource(String leadSource) {
        new Picklist(driver, "Lead Source").select(leadSource);
    }

    private void writeAsstPhone(String asstPhone) {
        new Input(driver, "Asst. Phone").write(asstPhone);
    }

    private void writeMailingAddress(Address mailingAddress) {
        new TextArea(driver, "Mailing Street").write(mailingAddress.getStreet());
        new Input(driver, "Mailing City").write(mailingAddress.getCity());
        new Input(driver, "Mailing State/Province").write(mailingAddress.getState());
        new Input(driver, "Mailing Zip/Postal Code").write(mailingAddress.getZip());
        new Input(driver, "Mailing Country").write(mailingAddress.getCountry());
    }

    private void writeOtherAddress(Address otherAddress) {
        new TextArea(driver, "Other Street").write(otherAddress.getStreet());
        new Input(driver, "Other City").write(otherAddress.getCity());
        new Input(driver, "Other State/Province").write(otherAddress.getState());
        new Input(driver, "Other Zip/Postal Code").write(otherAddress.getZip());
        new Input(driver, "Other Country").write(otherAddress.getCountry());
    }

    private void writeLanguages(String languages) {
        new Input(driver, "Languages").write(languages);
    }

    private void selectLevel(String level) {
        new Picklist(driver, "Level").select(level);
    }

    private void writeDescription(String description) {
        new TextArea(driver, "Description").write(description);
    }

}

//
//    public NewContactModal(WebDriver driver) {
//
//        super(driver);
//    }

//public class NewContactModal extends BasePage {
//    private WebDriver driver;
//
//    public NewContactModal(WebDriver driver) {
//        super(driver);
//    }
//    public void createAccount(String salutation, String firstName, String lastName, String phone, String homePhone,
//                              String mobile, String otherPhone, String fax, String title, String department,
//                              String birthdate, String email, String assistant, String leadSource, String asstPhone,
//                              String mailingStreet, String mailingCity, String mailingState, String mailingZip,
//                              String mailingCountry, String otherStreet, String otherCity, String otherState,
//                              String otherZip, String otherCountry, String languages, String level, String description) {
//        new Picklist(driver, "Salutation").select(salutation);
//        new Input(driver, "First Name").write(firstName);
//        new Input(driver, "Last Name").write(lastName);
//        new Input(driver, "Phone").write(phone);
//        new Input(driver, "Home Phone").write(homePhone);
//        new Input(driver, "Mobile").write(mobile);
//        new Input(driver, "Other Phone").write(otherPhone);
//        new Input(driver, "Fax").write(fax);
//        new Input(driver, "Title").write(title);
//        new Input(driver, "Department").write(department);
//        new Date(driver, "Birthdate").write(birthdate);
//        new Input(driver, "Email").write(email);
//        new Input(driver, "Assistant").write(assistant);
//        new Picklist(driver, "Lead Source").select(leadSource);
//        new Input(driver, "Asst. Phone").write(asstPhone);
//        new TextArea(driver, "Mailing Street").write(mailingStreet);
//        new Input(driver, "Mailing City").write(mailingCity);
//        new Input(driver, "Mailing State/Province").write(mailingState);
//        new Input(driver, "Mailing Zip/Postal Code").write(mailingZip);
//        new Input(driver, "Mailing Country").write(mailingCountry);
//        new TextArea(driver, "Other Street").write(otherStreet);
//        new Input(driver, "Other City").write(otherCity);
//        new Input(driver, "Other State/Province").write(otherState);
//        new Input(driver, "Other Zip/Postal Code").write(otherZip);
//        new Input(driver, "Other Country").write(otherCountry);
//        new Input(driver, "Languages").write(languages);
//        new Picklist(driver, "Level").select(level);
//        new TextArea(driver, "Description").write(description);
//   }
//}
