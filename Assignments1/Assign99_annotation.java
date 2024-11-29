package testng_assignments;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign99_annotation //1 Test,1AS 1BM
{
	@Test
	public void signin() 
	{
		System.out.println("Test");
	}
	@AfterSuite
	public void AS() 
	{
		System.out.println("AfterSuite");
	}
	@BeforeMethod
	public void BM() 
	{
		System.out.println("BeforeMethod");
	}

}  //order of execution: BM,Test, AS
