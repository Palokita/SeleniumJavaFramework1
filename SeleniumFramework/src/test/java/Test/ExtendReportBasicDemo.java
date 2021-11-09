package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportBasicDemo {
	static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
		
		//Create Extent Report and attach report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//create a toggle for google test
		ExtentTest test1 = extent.createTest("Google search test1", "this is on etest  for google search");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO,"Starting testcase");
		driver.get("http://google.com");
		test1.pass("Navigating to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Enter search to be searched");
		
		driver.findElement(By.name("btnK")).click();
		test1.pass("click search button");
		
		test1.info("test completed");
		
		//flushing report
		extent.flush();
		
	}
}
