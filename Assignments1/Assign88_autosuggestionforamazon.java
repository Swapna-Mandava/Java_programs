package assignments_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign88_autosuggestionforamazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.name("field-keywords"));
		e1.sendKeys("laptop");
		
		Thread.sleep(3000);

		
		List<WebElement> e2=  driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		Thread.sleep(3000);
		
        e2.get(e2.size()-1).click();
		
		
		
	}

}
