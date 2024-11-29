package testng_assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assign103_annotations //3 Test, 1AM, 1BM
{
	@Test
	public void testcase1() 
	{
		System.out.println("Test1");
	}
	@Test
	public void testcase2() 
	{
		System.out.println("Test2");
	}
	@Test
	public void testcase3() 
	{
		System.out.println("Test3");
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
	
	//order of execution: BM,Test1,AM,  BM,Test2,AM,  BM,Test3,AM
}
