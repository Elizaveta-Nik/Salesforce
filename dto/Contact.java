package dto;

public class Contact {

    private String salutation;
    private String firstName;
    private String lastName;
    private String phone;
    private String homePhone;
    private String mobile;
    private String otherPhone;
    private String fax;
    private String title;
    private String department;
    private String birthdate;
    private String email;
    private String assistant;
    private String leadSource;
    private String asstPhone;
    private String mailingStreet;
    private String mailingCity;
    private String mailingState;
    private String mailingZip;
    private String mailingCountry;
    private String otherStreet;
    private String otherCity;
    private String otherState;
    private String otherZip;
    private String otherCountry;
    private String languages;
    private String level;
    private String description;

    public Contact(String salutation, String firstName, String lastName, String phone, String homePhone, String mobile,
                   String otherPhone, String fax, String title, String department, String birthdate, String email,
                   String assistant, String leadSource, String asstPhone, String mailingStreet, String mailingCity,
                   String mailingState, String mailingZip, String mailingCountry, String otherStreet, String otherCity,
                   String otherState, String otherZip, String otherCountry, String languages, String level, String description) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.otherPhone = otherPhone;
        this.fax = fax;
        this.title = title;
        this.department = department;
        this.birthdate = String.valueOf(birthdate);
        this.email = email;
        this.assistant = assistant;
        this.leadSource = leadSource;
        this.asstPhone = asstPhone;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
        this.mailingZip = mailingZip;
        this.mailingCountry = mailingCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherZip = otherZip;
        this.otherCountry = otherCountry;
        this.languages = languages;
        this.level = level;
        this.description = description;
    }

    // Геттеры
    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public String getFax() {
        return fax;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getAssistant() {
        return assistant;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public String getOtherZip() {
        return otherZip;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public String getLanguages() {
        return languages;
    }

    public String getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    // Сеттеры
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public void setOtherZip(String otherZip) {
        this.otherZip = otherZip;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}