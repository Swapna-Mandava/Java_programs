package mainmethod;

public class Logicaloperators {
	
	int age= 100;
	
public static void main(String[] args) {
		
	int height=56;
	int weight=78;
	
	if(height==weight && height<weight) // AND OPERATOR
	
	{
		
	System.out.println("This person is chubby");
	
	}
		
	if(height<weight &&  height==56 )
	
	{
		System.out.println("This person has good height");
		
		}
	
 if(height==weight ||height<weight) // OR OPERATOR
	
	{
		
	System.out.println("This person is chubby");
	
	}
 
 if(height==weight ||height>weight) // OR OPERATOR
		
	{
		
	System.out.println("This person is short");
	}
 
 if(!(height==weight && height<weight)) //NOT  OPERATOR
		
	{
		
	System.out.println("This person is chubby");
	
	}
 

	}

}
