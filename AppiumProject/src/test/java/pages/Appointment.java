package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Appointment {
AndroidDriver driver;
	
	public Appointment(AndroidDriver driver) {
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
    
    public void clickBookAppt() {
        WebElement BookAppt = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
        BookAppt.click();
    }
    
    public void clickdropdown() {
        WebElement dropdown = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Book\").instance(2)"));
        dropdown.click();
    }
    
    public void clickdropdown2() {
        WebElement dropdown2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
        dropdown2.click();
    }

    public void clickappttype() {
        WebElement appttype = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Initial\")"));
        appttype.click();
    }
   
    public void clickdropdown3() {
        WebElement dropdown3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)"));
        dropdown3.click();
    }
   
    public void clickvisittype() {
        WebElement visittype = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Virtual\")"));
        visittype.click();
    }
    
    public void clickdropdown4() {
        WebElement dropdown4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(5)"));
        dropdown4.click();
    }
   
    public void clickoption() {
        WebElement option = driver.findElement(AppiumBy.className("android.widget.TextView"));
        option.click();
    }
    
    public void clickdropdown5() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown5 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)")));
        dropdown5.click();
    }
    
    public void clickOption2() {
        WebElement option2 = driver.findElement(AppiumBy.accessibilityId("Gream Smith"));
        option2.click();
    }
   
    public void performTouchAction() {
    TouchAction touchAction = new TouchAction(driver);

   
    int startX = 556;
    int startY = 2513;
    int endX = 643;
    int endY = 996;

    touchAction.press(PointOption.point(startX, startY))
               .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) 
               .moveTo(PointOption.point(endX, endY))
               .release()
               .perform();
    }
    
    public void clickoption3() {
        try {
            WebElement option3 = driver.findElement(AppiumBy.accessibilityId(" Friday 31 May 2024 "));
            option3.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    
    public void clickslot() {
        WebElement slot = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Morning Slots\")"));
        slot.click();
    }
    
    public void clickslotTime() {
        WebElement slotTime = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"10:00:00 + -10:30:00 \")"));
        slotTime.click();
    }
    

    public void performTouchAction1() {
    TouchAction touchAction1 = new TouchAction(driver);

       
    int startX1 = 706;
    int startY1 = 2421;
    int endX1 = 744;
    int endY1 = 1034;

    touchAction1.press(PointOption.point(startX1, startY1))
               .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) 
               .moveTo(PointOption.point(endX1, endY1))
               .release()
               .perform();
    }
    
    public void performTouchAction2() {
        TouchAction touchAction2 = new TouchAction(driver);

           
        int startX2 = 672;
        int startY2 = 2595;
        int endX2 = 725;
        int endY2 = 1020;

        touchAction2.press(PointOption.point(startX2, startY2))
                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) 
                   .moveTo(PointOption.point(endX2, endY2))
                   .release()
                   .perform();
        }
   
   
    
    public void enterReason() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    WebElement reason = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.EditText")));
    reason.sendKeys("sick");
    }

    public void clickBook() {
        WebElement book = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Book Appointment\")"));
        book.click();
    }
    
    public void clickConfirm() {
        WebElement confirm = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Confirm\")"));
        confirm.click();
    }
    
    
    public void clickFutureappt() {
        WebElement futureappt = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(5)"));
        futureappt.click();
    }
    

    public void clickPage() {
    	WebElement apptpage = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"));
    	apptpage.click();
    }

  
}
