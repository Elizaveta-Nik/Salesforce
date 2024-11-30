package wrappers;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Date {
    WebDriver driver;
    String label;

    public Date(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    @Description("Ввод даты")
    public void write(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-datepicker", label)))
                .sendKeys(text);
    }
}