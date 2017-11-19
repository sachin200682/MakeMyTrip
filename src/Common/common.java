package Common;


import org.openqa.selenium.chrome.ChromeDriver;


import Pages.Flights;
import Pages.HomePage;

public class common extends Driver
{
	public static void openbrowserandurl() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		//driver.manage().window().maximize();
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
	
	public static void FlightSource() 
	{
		Flights.FlightsFrom().click();
		Flights.FlightsFrom().sendKeys("Mumbai, India");
		Flights.FlightsFrom().click();
	}
	
	public static void FlightDestination() 
	{
		Flights.FlightsTo().click();
		Flights.FlightsTo().sendKeys("London, UK - All Airports ");
	}
	
	public static void FlightSearchButton() 
	{
		Flights.ClickOnFlightSearchButton().click();
	}
	public static void ClickSignInButton() 
	{
		HomePage.ClickOnSignInButton().click();		
	}
	
	public static void ClickEmailField() 
	{
		HomePage.ClickOnEmailField().click();
		HomePage.ClickOnEmailField().sendKeys("sachinseleniumpractice@gmail.com");
	}
	
	public static void ClickPasswordField() 
	{
		HomePage.ClickOnPasswordField().click();
		HomePage.ClickOnPasswordField().sendKeys("Selenium@123");
	}
	
	public static void ClickLoginButton() 
	{
		HomePage.ClickOnLoginButton().click();
	}
	
	public static void CloseBrowser() 
	{
		driver.close();
	}
	
	public static void QuitBrowser() 
	{
		driver.quit();
	}
}
