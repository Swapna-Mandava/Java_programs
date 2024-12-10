package crossbroswer.amazonlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Search extends Launchbrowser
{
	@Test
	public void search() 
	
	{
		System.out.println("Searching a produt");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Heater"+Keys.ENTER);
	}

}
