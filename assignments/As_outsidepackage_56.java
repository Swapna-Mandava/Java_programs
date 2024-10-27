package access.specifier;

import assignments.Assign54_accessspeifier; //outside the package by becoming subclass

public class As_outsidepackage_56 extends Assign54_accessspeifier

{
	public static void main(String[] args) {
		
		As_outsidepackage_56 a1=new As_outsidepackage_56();
		
		a1.camera();
		//a1.videos(); // private access specifier

		//a1.photos(); //default access specifier
		a1.add();
		
	
	
	
}
	
	
	

}
