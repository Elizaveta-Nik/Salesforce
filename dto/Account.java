package dto;

public class Account {
    private String accountName;
    private String rating;
    private String phone;
    private String fax;
    private String accountNumber;
    private String website;
    private String accountSite;
    private String tickerSymbol;
    private String type;
    private String ownership;
    private String industry;
    private int employees;
    private double annualRevenue;
    private String sicCode;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;
    private String shippingCountry;
    private String customerPriority;
    private String sla;
    private String date;
    private String slaSerialNumber;
    private int numberOfLocations;
    private String upsellOpportunity;
    private String active;
    private String description;

    public Account(String accountName, String rating, String phone, String fax, String accountNumber, String website,
                   String accountSite, String tickerSymbol, String type, String ownership, String industry,
                   int employees, double annualRevenue, String sicCode, String billingStreet, String billingCity,
                   String billingState, String billingZip, String billingCountry, String shippingStreet,
                   String shippingCity, String shippingState, String shippingZip, String shippingCountry,
                   String customerPriority, String sla, String date, String slaSerialNumber, int numberOfLocations,
                   String upsellOpportunity, String active, String description) {
        this.accountName = accountName;
        this.rating = rating;
        this.phone = phone;
        this.fax = fax;
        this.accountNumber = accountNumber;
        this.website = website;
        this.accountSite = accountSite;
        this.tickerSymbol = tickerSymbol;
        this.type = type;
        this.ownership = ownership;
        this.industry = industry;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.sicCode = sicCode;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.shippingStreet = shippingStreet;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;
        this.shippingCountry = shippingCountry;
        this.customerPriority = customerPriority;
        this.sla = sla;
        this.date = String.valueOf(date);
        this.slaSerialNumber = slaSerialNumber;
        this.numberOfLocations = numberOfLocations;
        this.upsellOpportunity = upsellOpportunity;
        this.active = active;
        this.description = description;
    }

    // геттеры
    public String getAccountName() {
        return accountName;
    }

    public String getRating() {
        return rating;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getAccountSite() {
        return accountSite;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getType() {
        return type;
    }

    public String getOwnership() {
        return ownership;
    }

    public String getIndustry() {
        return industry;
    }

    public int getEmployees() {
        return employees;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public String getSicCode() {
        return sicCode;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public String getCustomerPriority() {
        return customerPriority;
    }

    public String getSla() {
        return sla;
    }

    public String getDate() {
        return date;
    }

    public String getSlaSerialNumber() {
        return slaSerialNumber;
    }

    public int getNumberOfLocations() {
        return numberOfLocations;
    }

    public String getUpsellOpportunity() {
        return upsellOpportunity;
    }

    public String getActive() {
        return active;
    }

    public String getDescription() {
        return description;
    }

    // сеттеры
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setAccountSite(String accountSite) {
        this.accountSite = accountSite;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setEmployees(String employees) {
        this.employees = Integer.parseInt(employees);
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = Double.parseDouble(annualRevenue);
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public void setCustomerPriority(String customerPriority) {
        this.customerPriority = customerPriority;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSlaSerialNumber(String slaSerialNumber) {
        this.slaSerialNumber = slaSerialNumber;
    }

    public void setNumberOfLocations(String numberOfLocations) {
        this.numberOfLocations = Integer.parseInt(numberOfLocations);
    }

    public void setUpsellOpportunity(String upsellOpportunity) {
        this.upsellOpportunity = upsellOpportunity;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

