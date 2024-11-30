package pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import wrappers.Date;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void createAccount(String name, String rating, String phone, String fax, String accountNumber, String website,
                              String accountSite, String tickerSymbol, String type, String ownership, String industry,
                              String employees, String annualRevenue, String sicCode, String billingStreet,
                              String billingCity, String billingState, String billingsZip, String billingCountry,
                              String shippingStreet, String shippingCity, String shippingState, String shippingZip,
                              String shippingCountry, String customerPriority, String sla, String date,
                              String slaSerialNumber, String numberOfLocations, String upsellOpportunity, String active,
                              String description) {
        new Input(driver, "Account Name").write(name);
        new Picklist(driver, "Rating").select(rating);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new TextArea(driver, "Billing Street").write(billingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingState);
        new Input(driver, "Billing Zip/Postal Code").write(billingsZip);
        new Input(driver, "Billing Country").write(billingCountry);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingState);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZip);
        new Input(driver, "Shipping Country").write(shippingCountry);
        new Picklist(driver, "Customer Priority").select(customerPriority);
        new Picklist(driver, "SLA").select(sla);
        new Date(driver, "SLA Expiration Date").write(date);
        new Input(driver, "SLA Serial Number").write(slaSerialNumber);
        new Input(driver, "Number of Locations").write(numberOfLocations);
        new Picklist(driver, "Upsell Opportunity").select(upsellOpportunity);
        new Picklist(driver, "Active").select(active);
        new TextArea(driver, "Description").write(description);
    }
}
