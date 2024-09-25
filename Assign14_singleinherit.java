package mainmethod;

class Staticmethod{
	
	public static void area()
	{
		System.out.println("Bandar road");
	}
	
	static void house()
	{
		System.out.println("House no is 4-46");
	}
}

public class Assign14_singleinherit extends Staticmethod {
	
	static void apartment()
	{
		System.out.println("Tanishq apartments");
	}
	
	static void city()
	{
		System.out.println("Vijayawada");
	}
	
	static void Owner()
	{
		System.out.println("Owned by Ramakrishna");
	}
	
	public static void main(String[] args) 
	
	{
		house();
		apartment();
		area();
		Owner();
		city();
		
		
	}

	
		
	}


