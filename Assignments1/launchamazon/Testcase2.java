package launchamazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testcase2 extends Launchquit //Assignment_105
{
	@Test
	public void login_search_logout()
	{
		System.out.println("searching product ");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Air conditioner"+Keys.ENTER);
	}
}
