package launchamazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Launchquit {
	ChromeDriver driver;

	@BeforeMethod
	public void launch() throws InterruptedException

	{
		System.out.println("Launching browser");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		driver.findElement(By.id("ap_email")).sendKeys("swapnamandava8419@gmail.com");

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Swapna@2791");

		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(3000);

	}
	

	@AfterMethod
	public void quit() {
		System.out.println("Closing the browser");
		WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
		//driver.quit();
	}

}
