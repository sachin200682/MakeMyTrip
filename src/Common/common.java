package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.HomePage;

public class common 
{
	public static WebDriver driver;
	@Test
	public static void openbrowserandurl() 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	public static void clickOnFlights() 
	{
		HomePage.ClickOnFlights().click();
	}
	
	public static void ClickOnHoliday() 
	{
		HomePage.ClickOnHolidays().click();
	}
	
	public static void ClickOnHotel() 
	{
		HomePage.ClickOnHotels().click();
	}
	
	
	
	
	
	
	
	
	public static void CloseBrowser() 
	{
		driver.close();
	}
}
