package appiumpractice;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings({ "deprecation", "unused" })
public class Screenshot_assertion {

	private static WebDriver driver; 
	
    @SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args)  throws InterruptedException, IOException {
    	
    	 DesiredCapabilities dc = new DesiredCapabilities();

         dc.setCapability("deviceName", "Pixel 3 XL API 31");
         dc.setCapability("platformName", "Android");
         dc.setCapability("automationName", "uiautomator2");
         dc.setCapability("appplatformVersion", "12.0");
         dc.setCapability("app", "C:\\Users\\lnv0113\\Music\\apk\\TRST.apk");

         URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
         driver = new AndroidDriver(url, dc);

         Thread.sleep(5000);
         System.out.println("Application started");
        
         SoftAssert softAssert = new SoftAssert();
         softAssert.assertAll();
         
         
//  	Test steps
         
         WebElement ln = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"));
         ln.sendKeys("jay");
         
         WebElement fn = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"));
         fn.sendKeys("sharma");
         
         WebElement linkElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Already an existing user? Click here to Login\")"));
         String actualText3 = linkElement.getText();
         String expectedText3 = "Already an existing user? Click here to Logi";
         softAssert.assertEquals(actualText3, expectedText3, "Actual text does not match expected text.");
         
         takeScreenshot("name");

         WebElement con = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
         con.click();
         
         // Find the button element
         WebElement contbutton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
         String actualText4 = contbutton.getText();
         String expectedText4 = "Contin";
         softAssert.assertEquals(actualText4, expectedText4, "Actual text does not match expected text.");
         
         
         WebElement element2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Nice to meet you,\")"));
         String actualText2 = element2.getText();
         String expectedText2 = "Nice to meet yo,";
         softAssert.assertEquals(actualText2, expectedText2, "Actual text does not match expected text.");
         
         takeScreenshot("success");
         
         WebElement cont = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
         cont.click();

         TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);

         PointOption start = PointOption.point(1315, 1464);
         PointOption end = PointOption.point(164, 1460);

         touchAction.press(start).waitAction().moveTo(end).release().perform();

         PointOption start1 = PointOption.point(1300, 1450);
         PointOption end1 = PointOption.point(121, 1469);

         touchAction.press(start1).waitAction().moveTo(end1).release().perform();

         PointOption start2 = PointOption.point(1276, 1474);
         PointOption end2 = PointOption.point(92, 1493);

         touchAction.press(start2).waitAction().moveTo(end2).release().perform();

         WebElement conti = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
         conti.click();

         Thread.sleep(8000);
         
         WebElement program = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"More Energy\")"));
         program.click();

         Thread.sleep(5000);

         WebElement calendar = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"DD/MM/YYYY\")"));
         calendar.click();

         WebElement date = driver.findElement(AppiumBy.accessibilityId("08 April 2006"));
         date.click();
         
         takeScreenshot("dob");
         
         WebElement datepicker = driver.findElement(AppiumBy.accessibilityId("08 April 2006"));
         String actualText5 = datepicker.getText();
         String expectedText5 = "9";
         softAssert.assertEquals(actualText5, expectedText5, "Actual text does not match expected text.");

         Thread.sleep(2000);

         WebElement done = driver.findElement(AppiumBy.id("android:id/button1"));
         done.click();

         Thread.sleep(2000);

         WebElement don = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
         don.click();
         
         WebElement gender = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Male\")"));
         gender.click();

         Thread.sleep(2000);

         WebElement donee = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")"));
         donee.click();

         Thread.sleep(2000);

         WebElement signup = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign Up\")"));
         signup.click();

         WebElement button = driver.findElement(AppiumBy.className("android.widget.Button"));
         button.click();

         Thread.sleep(2000);

         // Generate random email
         String randomEmail = "user" + new Random().nextInt(1000) + "@example.com";

         // Generate random phone number
         String randomPhoneNumber = generateRandomPhoneNumber();

         // Find the email field and enter the random email
         WebElement emailField = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"));
         emailField.sendKeys(randomEmail);

         // Find the phone number field and enter the random phone number
         WebElement phoneNumberField = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"));
         phoneNumberField.sendKeys(randomPhoneNumber);

         WebElement pass = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)"));
         pass.sendKeys("Pass@123");
         
         takeScreenshot("signup");
         
         WebElement sign = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign Up\")"));
         sign.click();

         Thread.sleep(3000);

         PointOption tapPoint = PointOption.point(252, 1174);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint1 = PointOption.point(362, 2150);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint1)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint2 = PointOption.point(679, 2164);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint2)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint3 = PointOption.point(931, 2146);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint3)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint4 = PointOption.point(371, 2329);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint4)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint8 = PointOption.point(679, 2329);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint8)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint5 = PointOption.point(935, 2352);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint5)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();

         PointOption tapPoint6 = PointOption.point(1247, 2696);

         new TouchAction((PerformsTouchActions) driver)
                 .press(tapPoint6)
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(50)))
                 .release()
                 .perform();



         Thread.sleep(2000);

         WebElement signed = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Verify & Continue\")"));
         signed.click();

         Thread.sleep(5000);
         
         WebElement accept = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accept\")"));
         accept.click();
         
         WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Congratulations!\")"));
         WebElement element1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"You are signed up.\")"));
         
         takeScreenshot("congrats");
      
         String actualText = element.getText();
         String actualText1 = element1.getText();

        
         String expectedText = "Congratulations!";
         String expectedText1 = "You are signed u";

         softAssert.assertEquals(actualText, expectedText, "Actual text does not match expected text.");
         softAssert.assertEquals(actualText1, expectedText1, "Actual text does not match expected text.");
       
         softAssert.assertAll();
//        driver.quit();
      
     }
    
    private static void takeScreenshot(String fileName) {
    	 try{
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		LocalDateTime timestamp = LocalDateTime.now();
		String timestampString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		String screenshotDir = "C:\\Users\\lnv0113\\Music\\eclipse-jee-2024-03-R-win32-x86_64\\ddemo\\screenshots\\";
		String screenshotFilePath = screenshotDir + fileName + "_" + timestampString + ".png";
		
        File screenshotFolder = new File(screenshotDir);
        if (!screenshotFolder.exists()) {
            screenshotFolder.mkdirs();
        }
       
		screenshotFile.renameTo(new File(screenshotFilePath));

		System.out.println("Screenshot saved to: " + screenshotFilePath);
    }catch (Exception e) {
        e.printStackTrace();
    }

   }

     private static String generateRandomPhoneNumber() {
         StringBuilder phoneNumber = new StringBuilder();
         Random random = new Random();
         for (int i = 0; i < 10; i++) {
             phoneNumber.append(random.nextInt(10));
         }
         return phoneNumber.toString();
     }

	

}
