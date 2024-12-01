package pages.Contacts;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tests.base.BaseTest;

public class ContactsPage extends BaseTest {

    private final By TITLE = By.xpath("//p[@class='slds-page-header__name-meta']");
    private final String ADD_NEW_CONTACT = "//button[@name='NewContact']";
    private final String LIST_VIEW = "//button[@name='pipelineInspectionToListView']";
    private final String DROP_DOWN_MENU = "//button[@title='Select a List View: Contacts']";

    @Step("Получение заголовка страницы")
    @Description("Метод для получения заголовка текущей страницы")
    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    @Step("Нажатие на кнопку создание нового аккаунта {New}")
    @Description("Метод для нажатия на кнопку создания нового аккаунта")
    public void clickAddNewContactButton(String newAccount) {
        By addToCart = By.xpath(String.format(ADD_NEW_CONTACT, newAccount));
        driver.findElement(addToCart).click();
    }

    @Step("Нажатие на кнопку импорт аккаунтов {Import}")
    @Description("Метод для нажатия на кнопку импорта аккаунтов")
    public void clickListView(String listView) {
        By addToCart = By.xpath(String.format(LIST_VIEW, listView));
        driver.findElement(addToCart).click();
    }

    @Step("Нажатие на выпадающее меню {dropDownMenu} и выбор элемента {option}")
    @Description("Выбор элемента из выпадающего списка")
    public void select(String dropDownMenu, String option) {
        By addToCart = By.xpath(String.format(DROP_DOWN_MENU, dropDownMenu));
        driver.findElement(addToCart).click();

       // driver.findElement(By.xpath(String.format("//span[normalize-space()='%s']", option))).click(); не уверена в xpath
    }
}
