package mainmethod;

public class Assertion_class {
	
	public static void main(String[] args) {
		int age=17;
	//assert age>=18;
	assert age>=18:"sorry but the age of person is not 18"	;
				System.out.println("The age of the person is--" +age);
	}

}
