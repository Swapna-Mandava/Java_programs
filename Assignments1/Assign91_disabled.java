package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign91_disabled 
{

	public static void main(String[] args)
{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("121"));
		boolean b2=e1.isDisplayed();
		boolean b1=e1.isEnabled();
		
		System.out.println(b1);
		System.out.println(b2);
		
		if(b1==true && b2==true) 
		{
			e1.sendKeys("test");
		}
		
	
}

}
