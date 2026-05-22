package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.BaseTest.driver;

public class RegistrationFormPage extends BaseTest {
    /*WebDriver driver;
    WebElement firstNameField;
    WebElement lastNameField;
    WebElement emailField;
    WebElement ageField;
    WebElement salaryField;
    WebElement departmentField;
    WebElement submitButton;

    public RegistrationFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeField() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryField() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartmentField() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }*/

    public RegistrationFormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement getFirstNameField;

    @FindBy(id = "lastName")
    public WebElement getLastNameField;

    @FindBy(id = "userEmail")
    public WebElement getEmailField;

    @FindBy(id = "age")
    public WebElement getAgeField;

    @FindBy(id = "salary")
    public WebElement getSalaryField;

    @FindBy(id = "department")
    public WebElement getDepartmentField;

    @FindBy(id = "submit")
    public WebElement getSubmitButton;

    //----------------------------------

    public void inputFirstName(String firstName) {
        getFirstNameField.clear();
        getFirstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        getLastNameField.clear();
        getLastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmailField.clear();
        getEmailField.sendKeys(email);
    }

    public void inputAge(String age) {
        getAgeField.clear();
        getAgeField.sendKeys(age);
    }

    public void inputSalary(String salary) {
        getSalaryField.clear();
        getSalaryField.sendKeys(salary);
    }

    public void inputDepartment(String department) {
        getDepartmentField.clear();
        getDepartmentField.sendKeys(department);
    }

    public void clickOnSubmitButton() {
        getSubmitButton.click();
    }

}
