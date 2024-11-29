package testng_assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Assign100_annotations //1 AS,1 BS, 1 AM
{
	@AfterSuite
	public void AS() 
	{
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	public void bm()
	{
		System.out.println("BeforeSuite");
	}
	@AfterMethod
	public void quit() 
	{
		System.out.println("AfterMethod");
	}
}
