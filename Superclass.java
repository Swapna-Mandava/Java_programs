package mainmethod;
class login{
	
	login()
	{
	System.out.println("Give username");
	}
	}
class password extends login
{
	password()
	{
		System.out.println("Enter password");
	}
}
public class Superclass extends password
{
	
	Superclass ()
	{
		super ();
		System.out.println("Login to amazon");
	}
	
	public static void main(String[] args)
	{
		
		new  Superclass();
		
	}

}
