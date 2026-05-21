package Base;

import Pages.ElementsPage;
import Pages.HomePage;
import Pages.RegistrationFormPage;
import Pages.WebTablesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public WebTablesPage webTablesPage;
    public RegistrationFormPage registrationFormPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }
}
