package assignments;




public class Assign75_thiskeyword 
{  String name;
int age;
long salary;

void Employee_details(String name, int age, double salary) {
	
	this.name=name;
	this.age= age;
	this.salary=(long) salary;
}

	public static void main(String[] args) {
		
		Assign75_thiskeyword  t1= new Assign75_thiskeyword ();
		 t1.Employee_details("Minnu", 46, 60000);
		 
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);
		
	}

}
