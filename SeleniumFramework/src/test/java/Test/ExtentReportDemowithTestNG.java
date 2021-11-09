package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemowithTestNG {
	
	ExtentReports extent;
	ExtentSparkReporter htmlReporter;
	WebDriver driver = null;
	
	@BeforeSuite
	public void setup()
	{
		htmlReporter = new ExtentSparkReporter("extentReports.html");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setupTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void Test1()
	{
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("http://google.com");
		test.pass("Navigating to google.com");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void Test2()
	{
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		test.pass("Navigating to google.com");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void TearDownTest() {
		driver.close();
	}
	
	@AfterSuite
	public void TearDown()
	{
		extent.flush(); }

}