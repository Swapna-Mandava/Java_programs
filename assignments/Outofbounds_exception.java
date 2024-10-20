package assignments;

import java.util.Arrays;

public class Outofbounds_exception {
	public static void main(String[] args) {
		
		String name[]=new String[5];
		name[0]="India";
		name[1]="is";
		name[2]="my";
		name[3]="country";
		name[4]="I'm an ";
		name[5]="Indian";
		
		System.out.println(Arrays.toString(name));
		
		
	}
	
	

}
