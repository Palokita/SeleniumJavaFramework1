package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjectJava;

public class GoogleSearchPageTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();

	}

	public static void googleSearchTest()
	{
		System.setProperty("webdriver.chrome.driver", "P:\\New folder\\SeleniumFramework\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		GoogleSearchPageObjectJava SearchPageObj = new GoogleSearchPageObjectJava(driver);
		
		driver.get("http://google.com/");
		SearchPageObj.setTextInSearchBox("A B C D");
		SearchPageObj.clickSearchButton();
		
		driver.close();
		
	}
}
