package TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.common;
import Pages.Flights;
import Pages.HomePage;
public class TC_0001_SearchFlights extends Common.common
{
	@Test
public static void searchflights() 

{
	HomePage.openbrowserandurl();
	
	HomePage.ClickOnFlights().click();
	
	Flights.FlightsFrom().click();
	
	Flights.FlightSource();
	
	Flights.FlightDestination();
	
	Flights.clickOnFlights();
	
	common.CloseBrowser();
}
	
	
}
