package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {
    WebDriver driver;
    WebElement addButton;
    WebElement table;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getTable() {
        return driver.findElement(By.className("web-tables-wrapper"));
    }

    public WebElement row() {
        return getTable().findElement(By.xpath("//tr[4]"));
    }

    //---------------------

    public void clickOnAddButton() {
        getAddButton().click();
    }
}
