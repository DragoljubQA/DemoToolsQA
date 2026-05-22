package Base;

import Pages.Sidebar;
import Pages.HomePage;
import Pages.RegistrationFormPage;
import Pages.WebTablesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public Sidebar sidebar;
    public WebTablesPage webTablesPage;
    public RegistrationFormPage registrationFormPage;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        excelReader = new ExcelReader("WebTablesData.xlsx");
    }
}
