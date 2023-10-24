package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch 
{
	public WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver = driver;
	}

	
	By searchBox = By.xpath("//*[@name='q']");
	
	
	public void searchGoogle(String searchInput) throws InterruptedException
	{
		driver.findElement(searchBox).sendKeys(searchInput,Keys.ENTER);
		Thread.sleep(5000);
		
		
	}
		
	
}
