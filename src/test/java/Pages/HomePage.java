package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    WebElement elementsButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsButton() {
        return driver.findElement(By.className("card-body"));
    }

    //----------------------------

    public void clickOnElements() {
        getElementsButton().click();
    }

}
