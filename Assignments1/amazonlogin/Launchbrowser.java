package crossbroswer.amazonlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Launchbrowser 

{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void method1(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome")) 
		{
			driver=new ChromeDriver();
			
		}
		if(nameofbrowser.equals("edge")) 
		{
			driver=new EdgeDriver();
			
		}
		if(nameofbrowser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
			
		}
		
		System.out.println("closing browser");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		driver.findElement(By.id("ap_email")).sendKeys("swapnamandava8419@gmail.com");

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Swapna@2791");

		driver.findElement(By.id("signInSubmit")).click();

		
	}
	@AfterMethod
	public void logout() 
	{
		System.out.println("closing browser");
		
		System.out.println("Closing the browser");
		WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
