package assignments_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign88_autosuggestionforflipkart {

	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.in");
		driver.manage().window().maximize();
		
		// //(//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li)[5]
		
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("handbag");
		
		Thread.sleep(3000);
		
		List<WebElement> e2=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		Thread.sleep(3000);
		e2.get(5).click();
	}

}
