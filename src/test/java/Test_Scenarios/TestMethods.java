package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;

public class TestMethods {
	
	WebDriver driver;
	
	GoogleSearch gs;
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Programs1\\simple_project1\\util\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
	}
	
	
	
	@Test
	public void searchOperation() throws InterruptedException
	{
		gs = new GoogleSearch(driver);
		gs.searchGoogle("pratian technologies");
		Thread.sleep(5000);
		
		
		
		
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}	

}
