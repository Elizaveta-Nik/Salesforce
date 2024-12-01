package pages.Accounts;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tests.base.BaseTest;

public class AccountsPage extends BaseTest {

    private final By TITLE = By.xpath("//span[@class='slds-var-p-right_x-small']");
    private final String ADD_NEW_ACCOUNT = "//div[@title='New']//button";
    private final String IMPORT_ACCOUNT = "//div[@title='Import']//button";
    private final String DROP_DOWN_MENU = "//button[@title='Select a List View: Accounts']";
    private final String PIN_BUTTON = "//button[contains(@title,'Pin this list view.')]";

    @Step("Получение заголовка страницы")
    @Description("Метод для получения заголовка текущей страницы")
    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    @Step("Нажатие на кнопку создание нового аккаунта {New}")
    @Description("Метод для нажатия на кнопку создания нового аккаунта")
    public void clickAddNewAccountButton(String newAccount) {
        By addToCart = By.xpath(String.format(ADD_NEW_ACCOUNT, newAccount));
        driver.findElement(addToCart).click();
    }

    @Step("Нажатие на кнопку импорт аккаунтов {Import}")
    @Description("Метод для нажатия на кнопку импорта аккаунтов")
    public void clickImportAccountButton(String importAccount) {
        By addToCart = By.xpath(String.format(IMPORT_ACCOUNT, importAccount));
        driver.findElement(addToCart).click();
    }

    @Step("Нажатие на выпадающее меню {dropDownMenu} и выбор элемента {option}")
    @Description("Выбор элемента из выпадающего списка")
    public void select(String dropDownMenu, String option) {
        By addToCart = By.xpath(String.format(DROP_DOWN_MENU, dropDownMenu));
        driver.findElement(addToCart).click();

        driver.findElement(By.xpath(String.format("//span[normalize-space()='%s']", option))).click();
    }

    @Step("Нажатие на кнопку закрепления списка")
    @Description("Метод для нажатия на кнопку 'Pin this list view'")
    public void clickPinButton() {
        By pinButton = By.xpath(PIN_BUTTON);
        driver.findElement(pinButton).click();
    }
}