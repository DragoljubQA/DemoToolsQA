package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {
    WebDriver driver;
    WebElement addButton;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    //---------------------

    public void clickOnAddButton() {
        getAddButton().click();
    }
}
