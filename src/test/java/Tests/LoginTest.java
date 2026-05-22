package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.Sidebar;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");

        homePage = new HomePage();
        sidebar = new Sidebar();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();

        homePage.clickOnCard("Book Store Application");
        sidebar.clickOnSidebarButton("Login");
    }

    @Test
    public void userCanLogIn() {
        loginPage.inputUsername("DragoljubQA2026a");
        loginPage.inputPassword("Qwerty123!@#");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(profilePage.profileName.getText(),"DragoljubQA2026a");
        Assert.assertEquals(profilePage.profileNameText(), "DragoljubQA2026a");
    }

}
