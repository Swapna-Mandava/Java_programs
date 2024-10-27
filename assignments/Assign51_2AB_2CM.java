package assignments;
interface hospital{
	
	void bills();
	void op();
		}
abstract class medicalshop
{
	abstract void medicines();//abstract methods
	abstract void injections();


void tablets() //concrete  methods
{
	System.out.println("there are 10 ");
}

void ointments() {
	System.out.println("There are 5 ointments");
}
}

public class Assign51_2AB_2CM extends  medicalshop implements hospital
{
	

	void add() //concrete methods
	{ 
		
		int a=100;
		int b=20;
		int sum=a+b;
		
		System.out.println("Sum of two numbers is--" +sum);
	}
	
	void subtract() {
		
		System.out.println("The answer we get from subraction is difference");
	}
	
	public static void main(String[] args) {
		
		Assign51_2AB_2CM a1=new Assign51_2AB_2CM();
		a1.add();
		a1.tablets();
		a1.ointments();
		a1.subtract();
		a1.bills();
		a1.op();	
		a1.injections();
		a1.medicines();
		
		
	}

	@Override
	public void bills() {
		System.out.println("We have 1000 bills Today");
		
	}

	@Override
	public void op() {
		
		System.out.println("We have 100 op's Today");
	}

	@Override
	void medicines() {
		System.out.println("Medicines are expired");
		
	}

	@Override
	void injections() {
		System.out.println("have to give injections to 5 members");
		
	}

}
