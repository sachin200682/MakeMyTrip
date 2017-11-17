package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TestCase_0001_OpenBrowserAndURL 
{
	@Test
	public static void OpenBrowser() 
	{
		common.openbrowserandurl();
		System.out.println("Opened Browser and URL");
		
		common.clickOnFlights();
		System.out.println("Clicked on Flights tab");

		common.CloseBrowser();
		System.out.println("Closed the Browser");
		System.out.println("Test case has been passed");
		
		common.ClickOnHoliday();
		System.out.println("Clicked on Holiday");
		
		common.ClickOnHotel();
		System.out.println("Clicked on Hotels link");
		
	}
}
