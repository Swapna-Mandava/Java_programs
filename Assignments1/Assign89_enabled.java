package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign89_enabled 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.name("say hello"));
		
		boolean b1=e1.isEnabled();
		System.out.println(b1);

	}

}
