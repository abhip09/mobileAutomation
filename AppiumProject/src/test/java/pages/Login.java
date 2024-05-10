package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Login {
AndroidDriver driver;
	
	public Login(AndroidDriver driver) {
        this.driver = driver;
    }
	
	public void enterEmail(String email) {
        WebElement emailField = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Email\")"));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement pass = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Password\")"));
        pass.sendKeys(password);
    }

    public void clickLoginNewPatient() {
        WebElement login = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
        login.click();
    }
        
     public void clickMenu() {
        WebElement menu = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)"));
        menu.click();
     }

      public void logOut() {
        WebElement logout = driver.findElement(AppiumBy.accessibilityId(", Log out, "));
        logout.click();
      }
        
      public void confirmlogOut() {
        WebElement logout1 = driver.findElement(AppiumBy.accessibilityId("Logout"));
        logout1.click();
    }

}
