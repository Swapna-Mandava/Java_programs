package mainmethod;
class salary
{
 salary(long a){
System.out.println("Pay foe month is---"+a);

}

}

class Company extends salary
{
	Company(String b){
		
		super(28000);
		
		System.out.println("Name of the company--"+b);
	}
}

class employee extends Company

{
	employee(String c)
	{
		super("Infosis");
		System.out.println("Name of the employee is--"+c);

	}
	
}

public class Parasuperclass extends employee

{
	Parasuperclass(boolean d)
	{
		super("Kumar");
		System.out.println("experieced--" +d);
	}
	
public static void main(String[] args) {

	
	
	new Parasuperclass(true);
	
	
	
	
	
}
	
	
}
