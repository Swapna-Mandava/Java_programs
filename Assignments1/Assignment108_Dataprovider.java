package testng_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment108_Dataprovider 
{
	@DataProvider(name="product")
	public Object[][] method1()
	{ return new Object[][]{{"Udaipur"},{"President of India"},{"Software Testing"},{"Goldprice Today"},{"latest Telegu films"}};
		
	}
	@Test(dataProvider="product")
	public void searchchrome(String word) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys(word+Keys.ENTER);
		
	}

}
