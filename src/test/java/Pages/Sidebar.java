package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Sidebar extends BaseTest {
    /*WebDriver driver;
    WebElement webTablesButton;

    public Sidebar(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getSidebarOptions() {
        return driver.findElements(By.className("router-link"));
    }
*/

    public Sidebar() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "router-link")
    public List<WebElement> getSidebarOptions;

    //---------------------------

    public void clickOnSidebarButton(String buttonName) {
        for (int i = 0; i < getSidebarOptions.size(); i++) {
            if (getSidebarOptions.get(i).getText().equals(buttonName)) {
                getSidebarOptions.get(i).click();
                break;
            }
        }
    }

}
