package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {
    /*WebDriver driver;

    WebElement elementsButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }*/

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "card-body")
    public List<WebElement> getCards;



    //----------------------------

    /*public void clickOnElements() {
        getElementsButton().get(0).click();
    }

    public void clickOnForms() {
        getElementsButton().get(1).click();
    }

    public void clickOnAlerts() {
        getElementsButton().get(2).click();
    }*/

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getCards.size(); i++) {
            if(getCards.get(i).getText().equals(cardName)) {
                getCards.get(i).click();
                break;
            }
        }
    }

}
