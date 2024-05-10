package tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumBy;
import pages.SignUp;

public class TestSignup extends BaseClass {
	
	@Test
	public void testSignup()  throws InterruptedException, IOException {
		SignUp signupPage = new SignUp(driver);

	        try {
	        	
	            ExtentTest test = extent.createTest("Signup Test", "Demo test case");
	            test.log(Status.INFO, "Application started");
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	            wait.until(ExpectedConditions.visibilityOf(signupPage.getSignUpButton()));

	            signupPage.clickSignUp();
	            Thread.sleep(3000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            signupPage.enterFirstName("jay");
	            Thread.sleep(3000);

	            signupPage.enterLastName("sharma");
	            Thread.sleep(3000);

	            signupPage.enterEmail(generateRandomEmail());
	            Thread.sleep(3000);

	            signupPage.enterPhoneNumber(generateRandomPhoneNumber());
	            Thread.sleep(3000);

	            signupPage.enterPassword("Pass@1234");
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
	            

	            signupPage.clickCreateNewPatient();
	        } catch (NoSuchElementException | TimeoutException e) {
	            e.printStackTrace();
	        } finally {
	            tearDown();
	        }
	    }
	
		private String generateRandomEmail() {
			String randomEmail = "user" + new Random().nextInt(1000) + "@example.com";
			return randomEmail.toString();
		}

	    private String generateRandomPhoneNumber() {
	        StringBuilder phoneNumber = new StringBuilder();
	        for (int i = 0; i < 10; i++) {
	            phoneNumber.append((int) (Math.random() * 10));
	        }
	        return phoneNumber.toString();
	    }
	    
	    private String captureScreen() throws IOException {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String destFilePath = System.getProperty("user.dir") + "/Navala_screenshots/screenshot_" + 
	            LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) + ".png";
	        FileUtils.copyFile(srcFile, new File(destFilePath));
	        return destFilePath;
	    }
	    
	
}
