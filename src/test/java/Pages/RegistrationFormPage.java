package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationFormPage {
    WebDriver driver;
    WebElement firstNameField;
    WebElement lastNameField;
    WebElement emailField;
    WebElement ageField;
    WebElement salaryField;
    WebElement departmentField;

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

    //----------------------------------

    public void inputFirstName(String firstName) {
        getFirstNameField().clear();
        getFirstNameField().sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }

    public void inputAge(String age) {
        getAgeField().clear();
        getAgeField().sendKeys(age);
    }

    public void inputSalary(String salary) {
        getSalaryField().clear();
        getSalaryField().sendKeys(salary);
    }

    public void inputDepartment(String department) {
        getDepartmentField().clear();
        getDepartmentField().sendKeys(department);
    }

}
