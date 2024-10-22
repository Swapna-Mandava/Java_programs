package assignments;

import java.util.Arrays;

public class Assignment36 // WAP to find out the alphabates char, digits, spaces, and special char 
{
static int count_of_alphabets;
static int count_of_numbers;
static int count_of_spaces;
	
	public static void main(String[] args) {
		
		String input="The 3rd seminar is @loyala 56789 campus @bza";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<input.length();i++)
{
		
	boolean b1=Character.isAlphabetic(c1[i]);
	if(b1==true) {
		
		count_of_alphabets++;
		}
boolean b2=Character.isDigit(c1[i]);
if(b2==true)
{
	count_of_numbers++;
}

boolean b3=Character.isWhitespace(c1[i]);
if(b3==true) {
	count_of_spaces++;
	
}
	
	}
		
		System.out.println("The count of alphabets is-->" + count_of_alphabets);
		System.out.println("The count of numbers is-->" + count_of_numbers);
		System.out.println("The count of spaces is-->" + count_of_spaces);
		
		int count_of_specialchar=input.length()-(count_of_alphabets+count_of_numbers+count_of_spaces);
		System.out.println("The count of special characters  is-->" +count_of_specialchar);
	}
}
