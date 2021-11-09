package Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class chrome_error {

	public static void main(String[] args) {
		
		googleSearch();
	}

	public static void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("demo_capability", true);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.merge(capabilities);  //this will merge the capabilities to the ChromeOptions
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver1 = new ChromeDriver();
		driver.get("http://google.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.sendKeys("pragyanalokita");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
