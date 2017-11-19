package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
public static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		//driver.manage().window().maximize();
		driver.navigate().refresh();
		
		/*
		 * click on Login Button*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='ch__login cho_login']")).click();
		driver.findElement(By.xpath("//*[@id=\"ch_login_email\"]")).sendKeys("Sachin");
		
	}

}
