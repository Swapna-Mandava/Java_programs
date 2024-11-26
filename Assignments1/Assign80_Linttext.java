package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign80_Linttext {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=7503268383775285423&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061771&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		Thread.sleep(2000);
		d1.navigate().back();
		d1.navigate().forward();
		
		WebElement e1=d1.findElement(By.linkText("Customer Service"));
		e1.sendKeys(Keys.ENTER);
		
	}

}
