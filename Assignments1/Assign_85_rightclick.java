package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_85_rightclick {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");


		WebElement e1=driver.findElement(By.xpath("(//span[.='Login'])"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
		
	}

}
