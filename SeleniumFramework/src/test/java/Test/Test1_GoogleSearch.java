package Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		googleSearch();
	}

	public static void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "P:\\New folder\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
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
	driver.close();
	}
}
