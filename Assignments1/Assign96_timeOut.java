package testng_assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign96_timeOut 
{
	@Test(timeOut=3000)
	public void launch() 
	{
		ChromeDriver driver=new ChromeDriver();  //Exception: ThreadTimeoutException
	}
	@Test(timeOut=2000)
	public void quit() 
	{
		
	}

}
