package assignments;


public class Assign54_accessspeifier //caling access specifier within the same class

{
	
	public void add() {
		
		System.out.println("Add to gallery");
		
	}
	
 void photos() {
	 System.out.println("Click photos");
	}
	
	private void videos() {
		
		System.out.println("save videos");
	}
	
	protected void camera() {
		
		System.out.println("click on the camera");
	}
	
	
	public static void main(String[] args) {
		Assign54_accessspeifier a1=new Assign54_accessspeifier();
		
		a1.camera();
		a1.videos()
;
		a1.photos();
		a1.add();
		
		
	}

}
