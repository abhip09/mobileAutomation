package tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	static AndroidDriver driver;
	static ExtentReports extent;
	static ExtentSparkReporter spark;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException
	{
		extent = new ExtentReports();
        spark = new ExtentSparkReporter("Navala_appointment.html");
        extent.attachReporter(spark);
        
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("deviceName", "Pixel 6 Pro API 31");
        dc.setCapability("platformName", "Android");
        dc.setCapability("automationName", "uiautomator2");
        dc.setCapability("appplatformVersion", "12.0");
        dc.setCapability("app", "C:\\Users\\lnv0113\\Music\\eclipse-jee-2024-03-R-win32-x86_64\\AppiumProject\\src\\test\\resources\\app\\navala.apk");


        URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
        driver = new AndroidDriver(url, dc);
      Thread.sleep(5000);

		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
        extent.flush();
	}

}
