package assignments;

public class Checkthegivenvalue {
	
	public static void main(String[] args) {
		
	int[] number=new int[4];
	number[0]=65;
	number[1]=25;
	number[2]=57;	
	number[3]=56;	
	
	int notocheck=56;//part of array
	
	for(int i=0;i<4;i++) {
		
		
		if(notocheck==number[i]) {
			
			System.out.println(notocheck+ " is part of Array at the index position " +i);
			
		}
		
		
	}
	
	int notocheck1=58;// not part of array
	
for(int i=0;i<4;i++) {


	if(notocheck1==number[i]) 


	{
		System.out.println("58 is part of your Array");
		
	}
	else {
		System.out.println("58 is not part of your Array");
		i=4;
	}
	
}
	}
}
	


	
	
	
	
		
	


