package assignments_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign90_naukri {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V-JLVC3l3k2-yd1WbJ-YkEj9j-FBUs1dgQvfHcztf-sxKfkm7NQDKcaAnzwEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		
		System.out.println(driver.getWindowHandles());
		   
		   Set<String> id=driver.getWindowHandles();
		       Iterator<String> s1=           id.iterator();
		       String parent=s1.next();
		       String child=s1.next();
		       
		       System.out.println(parent);
		       System.out.println(child);
		       driver.switchTo().window(child);
		       WebElement e2=driver.findElement(By.xpath("(//div[@class='Xb9hP']/input)[1]"));
		       e2.sendKeys("test@gmail.com");
		       Thread.sleep(3000);
		       driver.close();
		
		
		
		
		     //WebElement e2=driver.findElement(By.xpath("//input[@id='identifierId']"));
		   	//WebElement e2=driver.findElement(By.name("identifier"));
		
	}

}
