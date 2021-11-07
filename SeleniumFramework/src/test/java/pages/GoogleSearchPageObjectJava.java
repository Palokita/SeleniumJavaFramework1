package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjectJava {

	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	//creating constructor for driver interface so that it can be used in other method
	public GoogleSearchPageObjectJava(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);}
	
	public void clickSearchButton()
	{
		driver.findElement(button_search).sendKeys(Keys.ENTER);}
	
	

}
