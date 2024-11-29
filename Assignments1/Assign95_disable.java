package testng_assignments;

import org.testng.annotations.Test;

public class Assign95_disable 
{
	@Test(enabled=false)
	public void testcase1()
	{
		
	}
	@Test(priority=2)
	public void signin()
	{
		System.out.println("signin");
	}

}
