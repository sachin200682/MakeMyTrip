package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Common.common;
import Pages.HomePage;

public class TC_0003_Login extends Common.common 
{
	@Test
	public static void SignIn() 
	{
		common.openbrowserandurl();
		System.out.println("Openend The Browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		common.ClickSignInButton();
		System.out.println("Clicked on SignIN Button field");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		common.ClickEmailField();
		System.out.println("Clicked on email field");
		
		common.ClickPasswordField();
		System.out.println("Clicked on Password field");
		
		common.ClickLoginButton();
		System.out.println("Clicked on Loginbutton");
		
		common.CloseBrowser();
	}

}
