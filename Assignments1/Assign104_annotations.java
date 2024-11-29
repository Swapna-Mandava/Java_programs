package testng_assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign104_annotations  //1 Test, 1AM, 1BM
{
	@Test
	public void signout() 
	{
		System.out.println("Test1");
	}
	
	@AfterMethod
	public void AM() 
	{
		System.out.println("AfterMethod");
	}
	
	@BeforeMethod
	public void BM() 
	{
		System.out.println("BeforeMethod");
	}
	
	//order of execution: BM,Test1,AM
}
