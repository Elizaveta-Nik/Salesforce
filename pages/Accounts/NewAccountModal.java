package pages.Accounts;

import dto.Account;
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
public class NewAccountModal extends BasePage {

    private final String BUTTON_PATTERN =
            "//button[text()='%s']//ancestor::records-form-footer//ul[@class='slds-button-group-row']";
    private final By BUTTON_SAVE = By.xpath(
            "//button[text()='Save']//ancestor::records-form-footer//ul[@class='slds-button-group-row']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_SAVE));
        return this;
    }

    @Override
    public NewAccountModal open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        return null;
    }

    @Step("Заполнение формы нового аккаунта корректными данными.")
    public NewAccountModal createAccount(Account account) {
        log.info("Creating account '{}'",account.getAccountName());
        //Информация об аккаунте
        new Input(driver, "Account Name").write(account.getAccountName());
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
//        new Input(driver, "Account Number").write(account.getAccountNumber());
//        new Input(driver, "Website").write(account.getWebsite());
//        new Input(driver, "Account Site").write(account.getAccountSite());
//        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
//        new Picklist(driver, "Type").select(account.getType());
//        new Picklist(driver, "Ownership").select(account.getOwnership());
//        new Picklist(driver, "Industry").select(account.getIndustry());
//        new Input(driver, "Employees").write(String.valueOf(account.getEmployees()));
//        new Input(driver, "Annual Revenue").write(String.valueOf(account.getAnnualRevenue()));
//        new Input(driver, "SIC Code").write(account.getSicCode());
//
//        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
//        new Input(driver, "Billing City").write(account.getBillingCity());
//        new Input(driver, "Billing State/Province").write(account.getBillingState());
//        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
//        new Input(driver, "Billing Country").write(account.getBillingCountry());
//
//        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
//        new Input(driver, "Shipping City").write(account.getShippingCity());
//        new Input(driver, "Shipping State/Province").write(account.getShippingState());
//        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
//        new Input(driver, "Shipping Country").write(account.getShippingCountry());
//
//        new Picklist(driver, "Customer Priority").select(account.getCustomerPriority());
//        new Picklist(driver, "SLA").select(account.getSla());
//        new Date(driver, "SLA Expiration Date").write(account.getDate());
//        new Input(driver, "SLA Serial Number").write(account.getSlaSerialNumber());
//        new Input(driver, "Number of Locations").write(String.valueOf(account.getNumberOfLocations()));
//        new Picklist(driver, "Upsell Opportunity").select(account.getUpsellOpportunity());
//        new Picklist(driver, "Active").select(String.valueOf(account.getActive()));
//
//        new TextArea(driver, "Description").write(account.getDescription());

        return this;
    }

    @Step("Нажатие на кнопку: {buttonName}")
    public void clickButton(String buttonName) {
        By button = By.xpath(String.format(BUTTON_PATTERN, buttonName));
        driver.findElement(button).click();
        new AccountsPage(driver);
    }
}