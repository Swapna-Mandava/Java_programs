package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign79_logintofb {
	
	public static void main(String[] args) {
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		d1.findElement(By.name("email")).sendKeys("Khainat17@gmail.com");
		d1.findElement(By.name("pass")).sendKeys("Swapna@2791");
		d1.findElement(By.name("pass")).sendKeys(Keys.ENTER);
		
	}

}
