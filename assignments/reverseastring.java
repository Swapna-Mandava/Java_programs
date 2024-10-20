package assignments;

public class reverseastring {
	public static void main(String[] args) {
		String input= "Indian flag";
		String output= "";
		for(int i=10;i>=0;i--) 
		{
			char c1= input.charAt(i);
			output= output+c1;
		}
		System.out.println(output);
	}

}
