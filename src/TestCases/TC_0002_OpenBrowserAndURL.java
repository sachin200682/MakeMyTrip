package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC_0002_OpenBrowserAndURL 
{
	@Test
	public static void OpenBrowser() 
	{
		common.openbrowserandurl();
		System.out.println("Opened Browser and URL");
		common.CloseBrowser();
	}
}
