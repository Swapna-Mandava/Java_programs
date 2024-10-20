package mainmethod;

interface Testcase1{
	
	void prod();
	int a=120;
	}

interface Testcase2{
	
	void stage();
	}

public class Interface_multiplelevelinheritance implements Testcase1,Testcase2

{
public static void main(String[] args) {
	
	Interface_multiplelevelinheritance i1= new Interface_multiplelevelinheritance();
	
i1.prod();
System.out.println("a");
}

public void stage() {
	
	
	
	
	
}


public void prod() {
	
	
	
}
}
