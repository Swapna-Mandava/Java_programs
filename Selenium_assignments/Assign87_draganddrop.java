package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign87_draganddrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement e1=driver.findElement(By.xpath("(//div[@id='container'])"));
		WebElement e2=driver.findElement(By.xpath("(//div[@id='div2'])"));
		
		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(e1, e2).perform();
		Thread.sleep(3000);
		
		a1.dragAndDrop(e2, e1).perform();
		
		

	}

}
