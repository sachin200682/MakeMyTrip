package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Common.common
{
	public static WebElement ClickOnHomePage() 
		{
			return driver.findElement(By.xpath("//*[@id=\"mmt_header_navigation\"]/div/div[1]/p/a/img"));	
		}
		
	public static WebElement ClickOnFlights() 
		{
			return driver.findElement(By.xpath("//a[@class='hdr_item_link active']"));
		}
	public static WebElement ClickOnHotels() 
		{
			return driver.findElement(By.xpath("header_tab_flights"));
		}
	public static WebElement ClickOnHolidays() 
		{
			return driver.findElement(By.id("header_tab_holidays"));
		}
	
	public static WebElement ClickOnSignInButton() 
		{
			return driver.findElement(By.xpath("//a[@class='ch__login cho_login']"));
		}
	
	public static WebElement ClickOnEmailField() 
	{
		return driver.findElement(By.xpath("//*[@id=\"ch_login_email\"]"));
	}
	
	public static WebElement ClickOnPasswordField() 
	{
		return driver.findElement(By.xpath("//input[@id='ch_login_password'"));
	}
	public static WebElement ClickOnLoginButton() 
	{
		return driver.findElement(By.xpath("//button[@id='ch_login_btn'"));
	}
	public static WebElement Password() 
	{
			return driver.findElement(By.xpath("//input[@id='ch_login_password']"));
	}
	public static WebElement ClickOnLogin() 
	{
			return driver.findElement(By.xpath("//button[@id='ch_login_btn']"));
	}
}
