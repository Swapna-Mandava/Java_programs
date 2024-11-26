package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign82_xpath {
	
	public static void main(String[] args) {
		
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		
		d1.get("file:///C:/Users/admin/Downloads/grotechminds.html");
		
		
		WebElement e1=d1.findElement(By.xpath("(/html//body/input)[1]"));
		
		
		e1.sendKeys("test");
		
	}

}
