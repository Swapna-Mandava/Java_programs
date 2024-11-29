package testng_assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assign101_annotation //2 Test,1 AM
{

	@Test
	public void signin() 
	{
		System.out.println("Test1");
	}
	@Test
	public void signout() 
	{
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void quit() 
	{
		System.out.println("AfterMethod");
	}
	
	//order of execution: Test1,AM,Test2
}
