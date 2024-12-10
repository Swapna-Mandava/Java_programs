package launchamazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Testcase1 extends Launchquit  //Assignment_106
{
	@Test
	public void login_search_add_logout() throws InterruptedException
	

	{
		System.out.println("Adding product to cart");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> e1 = driver.findElements(By.xpath("(//span[@class='rush-component'])/a"));
		e1.get(2).click();
		// System.out.println(driver.getWindowHandles());
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		e2.click();
		Thread.sleep(3000);

	}

}
