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
			return driver.findElement(By.className("hdr_item_link active"));
		}
	public static WebElement ClickOnHolidays() 
		{
			return driver.findElement(By.id("header_tab_holidays"));
		}
	
}
