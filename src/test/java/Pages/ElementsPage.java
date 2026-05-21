package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    WebDriver driver;
    WebElement webTablesButton;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebTablesButton() {
        return driver.findElement(By.linkText("Web Tables"));
    }

    //---------------------------

    public void clickOnWebTables() {
        getWebTablesButton().click();
    }

}
