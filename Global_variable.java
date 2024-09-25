package mainmethod;



public class Global_variable //static method
{
	static int age=51;
	static String name;
	static boolean answer;
	long number=998568;// non static method
	String job="engineer";
	

	public static void main(String[] args) {
		
		int exp=2; 
		int multi=age*exp;
		name="krishna";
		
		

     System.out.println(age+exp);
     
     System.out.println(multi);	
     System.out.println(name);
     Global_variable g1= new Global_variable(); // non static method
     
     System.out.println(g1.number);
     g1.job="doctor";
     System.out.println(g1.job   );
	}
}
