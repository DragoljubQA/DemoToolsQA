package Tests;

import Base.BaseTest;
import Pages.Sidebar;
import Pages.HomePage;
import Pages.RegistrationFormPage;
import Pages.WebTablesPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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

        homePage = new HomePage();
        sidebar = new Sidebar();
        webTablesPage = new WebTablesPage();
        registrationFormPage = new RegistrationFormPage();

        homePage.clickOnCard("Elements");
        sidebar.clickOnSidebarButton("Web Tables");
    }

    @Test
    public void addUsersToWebTables() {
        for (int i = 1; i <= excelReader.getLastRow("Sheet1"); i++) {
            String validFirstName = excelReader.getStringData("Sheet1", i, 0);
            String validLastName = excelReader.getStringData("Sheet1", i, 1);
            String validEmail = excelReader.getStringData("Sheet1", i, 2);
            String validAge = String.valueOf(excelReader.getIntegerData("Sheet1", i, 3));
            String validSalary = String.valueOf(excelReader.getIntegerData("Sheet1", i, 4));
            String validDepartment = excelReader.getStringData("Sheet1", i, 5);
            webTablesPage.clickOnAddButton();
            registrationFormPage.inputFirstName(validFirstName);
            registrationFormPage.inputLastName(validLastName);
            registrationFormPage.inputEmail(validEmail);
            registrationFormPage.inputAge(validAge);
            registrationFormPage.inputSalary(validSalary);
            registrationFormPage.inputDepartment(validDepartment);
            registrationFormPage.clickOnSubmitButton();
            Assert.assertEquals(webTablesPage.firstName(i).getText(), validFirstName);
            Assert.assertEquals(webTablesPage.lastName(i).getText(), validLastName);
            Assert.assertEquals(webTablesPage.email(i).getText(), validEmail);
            Assert.assertEquals(webTablesPage.age(i).getText(), validAge);
            Assert.assertEquals(webTablesPage.salary(i).getText(), validSalary);
            Assert.assertEquals(webTablesPage.department(i).getText(), validDepartment);
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
