package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SignUp {
	AndroidDriver driver;
	
	public SignUp(AndroidDriver driver) {
        this.driver = driver;
    }
	
	public WebElement getSignUpButton() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign Up\")"));
    }

    public void clickSignUp() {
        getSignUpButton().click();
    }
	 public void enterFirstName(String firstName) {
	        WebElement fn = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"First Name\")"));
	        fn.sendKeys(firstName);
	    }

	    public void enterLastName(String lastName) {
	        WebElement ln = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Last Name\")"));
	        ln.sendKeys(lastName);
	    }

	    public void enterEmail(String email) {
	        WebElement emailField = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Email\")"));
	        emailField.sendKeys(email);
	    }

	    public void enterPhoneNumber(String phoneNumber) {
	        WebElement phoneNumberField = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Contact Number\")"));
	        phoneNumberField.sendKeys(phoneNumber);
	    }

	    public void enterPassword(String password) {
	        WebElement pass = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Password\")"));
	        pass.sendKeys(password);
	    }

	    public void clickCreateNewPatient() {
	        WebElement create = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Create New Patient\")"));
	        create.click();
	    }

}
