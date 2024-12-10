package testng_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Searchamazon_DP_assign111

{
	@DataProvider(name = "product")
	public Object[][] search() {
		Object[][] input = new Object[10][1];
		input[0][0] = "mobile";
		input[1][0] = "shoe";
		input[2][0] = "slippers";
		input[3][0] = "earphones";
		input[4][0] = "mouse wireless";
		input[5][0] = "earpods";
		input[6][0] = "jacket";
		input[7][0] = "mobile back cover";
		input[8][0] = "ac";
		input[9][0] = "geyser";

		return input;

	}

	@Test(dataProvider = "product")
	public void method1(String input) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(input + Keys.ENTER);
	}

}
