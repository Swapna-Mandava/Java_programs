package testng_assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginamazon_DP_110

{
	@DataProvider(name = "logindetails")
	public Object[][] method1() {
		Object[][] data = new Object[5][2];
		// 1st test case
		data[0][0] = "swapnamandava8419@gmail.com"; // valid un
		data[0][1] = "Swapna@2791"; // valid pwd
		// 2nd test case
		data[1][0] = "swapnamandava8419@gmail.com"; // valid un
		data[1][1] = "swapna@123"; // invalid pwd

		// 3rd test case
		data[2][0] = "swapnamandava@gmail.com"; // invalid un
		data[2][1] = "swapnamandava8419@gmail.com"; // invalid pwd
		// 4th test case
		data[3][0] = "swapnamandava89@gmail.com"; // invalid un
		data[3][1] = "Swapna@2791"; // valid pwd
		// 5th test case
		data[4][0] = ""; // null
		data[4][1] = "";
		return data;
	}

	@Test(dataProvider = "logindetails")
	public void login(String username, String password) {

		ChromeDriver d1 = new ChromeDriver();

		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.manage().window().maximize();

		WebElement e1 = d1.findElement(By.id("ap_email"));
		e1.sendKeys(username);

		WebElement e2 = d1.findElement(By.id("continue"));
		e2.click();

		WebElement e3 = d1.findElement(By.id("ap_password"));
		e3.sendKeys(password);

		WebElement e4 = d1.findElement(By.id("signInSubmit"));
		e4.click();

	}

}
