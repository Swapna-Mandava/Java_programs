package testng_assignments;

import org.testng.annotations.Test;

public class Assign94_priority 
{
	
	@Test (priority=1)
	public void password()
	{
		System.out.println("enter password");
	}
	@Test(priority=2)
	public void signin()
	{
		System.out.println("signin");
	}
	
	@Test
	public void emailid()
	{
		System.out.println("enter emailid");
	}

}
