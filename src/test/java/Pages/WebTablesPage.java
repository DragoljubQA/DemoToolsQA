package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage extends BaseTest {
    /*WebDriver driver;
    WebElement addButton;
    WebElement table;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getTable() {
        return driver.findElement(By.tagName("tbody"));
    }*/

    public WebTablesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement getAddButton;

    @FindBy(tagName = "tbody")
    public WebElement getTable;

    //-----------------------------------

    public WebElement firstName(int i) {
        return getTable.findElement(By.xpath("//tr["+(i+3)+"]/td"));
    }

    public WebElement lastName(int i) {
        return getTable.findElement(By.xpath("//tr["+(i+3)+"]/td[2]"));
    }

    public WebElement age(int i) {
        return getTable.findElement(By.xpath("//tr["+(i+3)+"]/td[3]"));
    }

    public WebElement email(int i) {
        return getTable.findElement(By.xpath("//tr["+(i+3)+"]/td[4]"));
    }

    public WebElement salary(int i) {
        return getTable.findElement(By.xpath("//tr["+(i+3)+"]/td[5]"));
    }

    public WebElement department(int i) {
        return getTable.findElement(By.xpath("//tr["+(i+3)+"]/td[6]"));
    }

    //---------------------

    public void clickOnAddButton() {
        getAddButton.click();
    }
}
