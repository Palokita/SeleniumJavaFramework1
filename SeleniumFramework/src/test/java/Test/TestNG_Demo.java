package Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo {
	WebDriver driver = null;
	
	@BeforeTest

	public void setupTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch()
	{
		
		driver.get("http://google.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.sendKeys("pragyanalokita");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	
	@AfterTest
	public void tearDownTest()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.close();
	}
}
