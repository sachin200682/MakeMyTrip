package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pages.HomePage;
public class Flights extends Common.common 
{
	public static WebElement FlightsFrom() 
	{
		return driver.findElement(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input']"));
	}
	
	public static WebElement FlightsTo() 
	{
		return driver.findElement(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input chromexPathFinder']"));
	}
	
	public static WebElement ClickOnFlightSearchButton() 
	{
		return driver.findElement(By.xpath("//button[@id='searchBtn']"));
	}
	
	public static void DepartDate() 
	{
		Select date = new Select(driver.findElement(By.xpath("//input[@class='checkSpecialCharacters']")));
		date.selectByValue("25");
	}
	
}
