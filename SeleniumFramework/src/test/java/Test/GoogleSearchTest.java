package Test;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//importing the class where object is defined
import pages.GoogleSearchPages;

public class GoogleSearchTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearch();
	}

	public static void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("http://google.com/");
		
		GoogleSearchPages.textbox_search(driver).sendKeys("Hello");
		GoogleSearchPages.button_search(driver).sendKeys(Keys.ENTER);
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.close();
	}
}
