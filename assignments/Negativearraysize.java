package assignments;

import java.util.Arrays;

public class Negativearraysize {
	public static void main(String[] args) {
		
		int idno[]=new int[-5];
		idno[0]=78;
		idno[1]=22;
		idno[2]=31;
		idno[3]=21;
		idno[4]=1;
		System.out.println(Arrays.toString(idno));
		
	}

}
