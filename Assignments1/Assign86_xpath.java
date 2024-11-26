package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign86_xpath {

	public static void main(String[] args) {
		
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		
		d1.get("file:///C:/Users/admin/Downloads/grotechminds.html");
		
		
		WebElement e1=d1.findElement(By.xpath("(/html//body/input)[1]"));
		
		
		e1.sendKeys("test");
		
		WebElement e2=d1.findElement(By.xpath("(/html/body/input)[2]"));
		
		e2.sendKeys("password1");
		
		
WebElement e3=d1.findElement(By.xpath("(/html/body/input)[3]"));
		
		e3.sendKeys("password_1");
		
		
		
d1.findElement(By.xpath("(html/body/form/input)[1]")).sendKeys("Swapna");
	
//d1.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("Mandava");	
		
WebElement e5= d1.findElement(By.xpath("(/html/body/form/input)[3]"));
e5.sendKeys(Keys.ENTER);	

WebElement e4= d1.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));	
  e4.click();
		
  WebElement e6= d1.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));	
  e6.click();
			
  WebElement e7=d1.findElement(By.xpath("(/html/body/input)[5]"));
  
  e7.click();	
  
  
 WebElement e8=d1.findElement(By.xpath("(/html/body/input)[6]"));
  
  e8.click();	
  
  
  WebElement e9=d1.findElement(By.xpath("(/html//body/input)[1]"));
  
  Select s1= new Select(e9);
  
  s1.selectByValue("1");
 
  d1.findElement(By.xpath("(/html/body/input)[7]")).sendKeys(Keys.ENTER);
  
  
		

	}

}
