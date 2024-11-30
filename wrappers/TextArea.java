package wrappers;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {//для больших полей

    WebDriver driver;
    String label;
    String textAreaPattern = "//label[text()='%s']//ancestor::lightning-textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    @Description("Ввод текста в широкое поле")
    public void write(String text) {//Billing Street, Shipping Street, Description
        driver.findElement(By.xpath(String.format(textAreaPattern + "//textarea", label)))
                .sendKeys(text);
    }
}
