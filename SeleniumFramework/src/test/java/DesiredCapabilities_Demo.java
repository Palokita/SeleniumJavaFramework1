import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DesiredCapabilities_Demo {
	static WebDriver driver = null;
	public static void main(String[] args) {
		//DesiredCapabilities caps = DesiredCapabilities.chrome();
		//caps.setCapability("ignoreProtectedModeSettings", true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		//driver = new ChromeDriver(caps);
		driver.get("http://google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		driver.findElement(By.name("btnK")).click();
		
	}

}
