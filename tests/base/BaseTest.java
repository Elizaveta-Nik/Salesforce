package tests.base;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.Accounts.AccountsPage;
import pages.Accounts.NewAccountModal;
import pages.Contacts.ContactsPage;
import pages.Contacts.NewContactModal;
import pages.HomePage;
import pages.LoginPage;
import steps.AccountStep;
import steps.ContactStep;
import steps.LoginStep;
import tests.TestListener;

import java.time.Duration;

@Listeners (TestListener.class)
public abstract class BaseTest {

    protected WebDriver driver;
    protected NewAccountModal newAccountModal;
    protected LoginPage loginPage;
    protected AccountsPage accountsPage;
    protected ContactsPage contactsPage;
    protected NewContactModal newContactModal;
    protected AccountStep accountStep;
    protected ContactStep contactStep;
    protected LoginStep loginStep;
    protected HomePage homePage;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    @Description("Открытие браузера")
    public void setup(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else {
            throw new IllegalArgumentException("Браузер не поддерживается: " + browser);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        newAccountModal = new NewAccountModal(driver);
        newContactModal = new NewContactModal(driver);
        loginPage = new LoginPage(driver);
        accountsPage = new AccountsPage(driver);
        contactsPage = new ContactsPage(driver);
        accountStep = new AccountStep(driver);
        contactStep = new ContactStep(driver);
        loginStep = new LoginStep(driver);
        homePage = new HomePage(driver);
    }

    @AfterMethod(alwaysRun = true)
    @Description("Закрытие браузера")
    public void tearDown(ITestResult result) {
        driver.quit();
    }
}