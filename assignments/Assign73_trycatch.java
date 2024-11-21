package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign73_trycatch {
	
	public static void main(String[] args) throws NegativeArraySizeException,ArrayIndexOutOfBoundsException
	{
		
		try{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter size of an erray");
        int size=s1.nextInt();
        		
        int[] studentid= new int [size];
       
        studentid[0]=5679;
        studentid[1]=579;
        studentid[2]=59;
        
        s1.close();
		}
		catch(NegativeArraySizeException n1) {
			
		System.out.println("The array size should be  positive");
		
		}
		
		catch(ArrayIndexOutOfBoundsException a1) {
			
			System.out.println("enter the correct value");
			
			}
		
      catch(InputMismatchException i1) {
			
			System.out.println("Array size should be numeric");
			
			}
		
		
		
		
		}
		
	}


