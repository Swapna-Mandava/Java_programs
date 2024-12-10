package assign112.retryanalyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test(retryAnalyzer=Retry_logic.class)
	public void login()
	{
		System.out.println("Launching browser");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		driver.findElement(By.id("ap_email")).sendKeys("swapnamandava8419@gmail.com");

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_passwordd")).sendKeys("Swapna@2791");

		driver.findElement(By.id("signInSubmit")).click();
		
	

	}

}
