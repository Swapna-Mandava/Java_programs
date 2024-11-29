package testng_assignments;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assign98_annotation //2test,1AS,1BS
{
	@Test
	public void testcase1() 
	{
		System.out.println("testcase1");
	}
	@Test
	public void testcase2() 
	{
		System.out.println("testcase2");
	}
	@BeforeSuite
	public void bm()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void am()
	{
		System.out.println("AfterSuite");
	}

  //order of execution: BS, Testcase1,Testcase2,AS
}
