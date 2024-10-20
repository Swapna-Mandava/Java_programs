package assignments;

public class Check_Palindrome {
	
	public static void main(String[] args) {
		
		String oldcarname= "skoda"; //not a palindrome
		String newcarname= "";
		for(int i=oldcarname.length()-1;i>=0;i--) 
		{
			char c1= oldcarname.charAt(i);
			
			newcarname= newcarname+c1;
			
}
		System.out.println(newcarname);
		
		boolean b1= oldcarname.equals(newcarname);
		if(b1==true)
		{
		System.out.println("It's a palindrome");
		}
		
		else {
			System.out.println("It's not a palindrome");
			
		}
		
		String input= "dad"; //palindrome
		String output="";
		
		
	for(int i=2;i>=0;i--) {

		char c= input.charAt(i);
		output=output+c;
		
	}
		System.out.println(output);
		
		boolean b2= input.equals(output);
		
		if (b2==true)
		{
			System.out.println("It's a palindrome");
		}
		else 
		{
			System.out.println("It's not a palindrome");
		}
}
}