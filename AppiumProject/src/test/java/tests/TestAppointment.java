package tests;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.Appointment;
import pages.Login;

public class TestAppointment extends BaseClass{
	
	@Test
	public void testAppointment()  throws InterruptedException, IOException {
		Appointment appointmentPage = new Appointment(driver);
		
		
		 try {
	        	
	            ExtentTest test = extent.createTest("Appointment Test", "Demo test case");
 	          
	            appointmentPage.enterEmail("jay12@mailinator.com");
	            Thread.sleep(3000);
	            
	            appointmentPage.enterPassword("Pass@123");
	            Thread.sleep(2000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            
	            appointmentPage.clickLoginNewPatient();
	            Thread.sleep(5000);
	            
	            appointmentPage.clickBookAppt();
	            Thread.sleep(3000); 
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            
	            appointmentPage.clickdropdown();
	            Thread.sleep(3000); 
	            
	            appointmentPage.clickdropdown2();
	            Thread.sleep(3000); 
	            
	            appointmentPage.clickappttype();
	            Thread.sleep(3000);
	            
	            appointmentPage.clickdropdown3();
	            Thread.sleep(3000);
	            
	            appointmentPage.clickvisittype();
	            Thread.sleep(4000);
	            
	            appointmentPage.clickdropdown4();
	            Thread.sleep(3000);
	            
	            appointmentPage.clickoption();
//	            Thread.sleep(5000);
	            
	            appointmentPage.clickdropdown5();
	            Thread.sleep(6000);
	            
	            appointmentPage.clickOption2();
	            Thread.sleep(5000);
	            
	            appointmentPage.performTouchAction();
	            Thread.sleep(4000);
	            
	            appointmentPage.clickoption3();
	            Thread.sleep(3000);
	            
	            appointmentPage.clickslot();
	            Thread.sleep(3000);
	            
	            appointmentPage.clickslotTime();
	            Thread.sleep(3000);
	            
	            appointmentPage.performTouchAction1();
	            Thread.sleep(3000);
	            
	            appointmentPage.performTouchAction2();
	            Thread.sleep(3000);
	            
	            appointmentPage.enterReason();
	            Thread.sleep(3000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            
	            appointmentPage.clickBook();
	            Thread.sleep(3000);
	            
	            appointmentPage.clickConfirm();
	            Thread.sleep(3000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());

	            appointmentPage.clickFutureappt();
	            Thread.sleep(3000);
	            test.log(Status.PASS, "clicked on link", MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
	            
	            appointmentPage.clickPage();
//	            Thread.sleep(3000);
	            

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