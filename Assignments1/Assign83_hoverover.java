package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign83_hoverover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement e1=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a1=new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		WebElement e2=driver.findElement(By.xpath("(//object/a)[4]"));
		a1.moveToElement(e2).perform();
	
		
		WebElement e3=driver.findElement(By.linkText("Men's Sports Shoes"));
		e3.click();


	}

}
