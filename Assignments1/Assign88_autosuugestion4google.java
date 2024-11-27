package assignments_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign88_autosuugestion4google {

	public static void main(String[] args) throws InterruptedException 
	{

     ChromeDriver driver =new  ChromeDriver();
     driver.get("https://www.google.com/");
     
     driver.manage().window().maximize();
     
     WebElement e1=driver.findElement(By.className("gLFyf"));
     e1.sendKeys("Rajiv Gandhi");
     
     Thread.sleep(3000);
     
     List<WebElement> e2=driver.findElements(By.xpath("(//ul[@class='G43f7e'])/li"));
     Thread.sleep(3000);
     int length=e2.size();
     System.out.println(length);
     
     
     e2.get(5).click();
     
     
     
     
     
     
	}

}
