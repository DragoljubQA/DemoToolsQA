package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sidebar {
    WebDriver driver;
    WebElement webTablesButton;

    public Sidebar(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getSidebarOptions() {
        return driver.findElements(By.className("router-link"));
    }

    //---------------------------

    public void clickOnSidebarButton(String buttonName) {
        for (int i = 0; i < getSidebarOptions().size(); i++) {
            if (getSidebarOptions().get(i).getText().equals(buttonName)) {
                getSidebarOptions().get(i).click();
                break;
            }
        }
    }

}
