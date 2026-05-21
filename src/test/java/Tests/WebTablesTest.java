package Tests;

import Base.BaseTest;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.RegistrationFormPage;
import Pages.WebTablesPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");

        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        webTablesPage = new WebTablesPage(driver);
        registrationFormPage = new RegistrationFormPage(driver);
    }

    @Test
    public void webTables() {
        homePage.clickOnElements();
        elementsPage.clickOnWebTables();
        webTablesPage.clickOnAddButton();
        registrationFormPage.inputFirstName("Steve");
        registrationFormPage.inputLastName("Stevens");
        registrationFormPage.inputEmail("sstevens@mail.com");
        registrationFormPage.inputAge("28");
        registrationFormPage.inputSalary("2000");
        registrationFormPage.inputDepartment("IT");
        registrationFormPage.clickOnSubmitButton();
        Assert.assertTrue(webTablesPage.row().getText().contains("Steve"));
        Assert.assertTrue(webTablesPage.row().getText().contains("Stevens"));
        Assert.assertTrue(webTablesPage.row().getText().contains("sstevens@mail.com"));
        Assert.assertTrue(webTablesPage.row().getText().contains("28"));
        Assert.assertTrue(webTablesPage.row().getText().contains("2000"));
        Assert.assertTrue(webTablesPage.row().getText().contains("IT"));
    }


}
