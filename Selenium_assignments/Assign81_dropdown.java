package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign81_dropdown {

	public static void main(String[] args) {
		
		
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		d1.get("https://grotechminds.com/registration/");
		
		WebElement e1=d1.findElement(By.id("Skills"));
		
		Select s1=new Select(e1);
		
		s1.selectByValue("select1");
		
WebElement e2=d1.findElement(By.id("Country"));
		
		Select s2=new Select(e2);
		
		s2.selectByIndex(8);
		
WebElement e3=d1.findElement(By.name("Relegion"));
		
		Select s3=new Select(e3);
		s3.selectByVisibleText("Hindu");
		
		
		
		
		

	}

}
