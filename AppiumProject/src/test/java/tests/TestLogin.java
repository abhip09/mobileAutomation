package tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.Login;
import pages.SignUp;

public class TestLogin extends BaseClass{
	
	@Test
	public void testLogin()  throws InterruptedException, IOException {
		Login loginPage = new Login(driver);
		
		
		 try {
	        	
	            ExtentTest test = extent.createTest("Login Test", "Demo test case");
 	          
	            loginPage.enterEmail("jay12@mailinator.com");
	            Thread.sleep(3000);
	            
	            loginPage.enterPassword("Pass@123");
	            Thread.sleep(2000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            
	            loginPage.clickLoginNewPatient();
	            Thread.sleep(3000);
	            
	            loginPage.clickMenu();
	            Thread.sleep(2000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            
	            loginPage.logOut();
	            Thread.sleep(2000);

	            
	            loginPage.confirmlogOut();

		 } catch (NoSuchElementException | TimeoutException e) {
        e.printStackTrace();
    } finally {
        tearDown();
    }
	}
	 	private String captureScreen() throws IOException {
	 			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 			String destFilePath = System.getProperty("user.dir") + "/Navala_screenshots/screenshot_" + 
	            LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) + ".png";
	 			FileUtils.copyFile(srcFile, new File(destFilePath));
	 			return destFilePath;
	    }
	    
}
