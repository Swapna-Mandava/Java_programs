package assignments;


class Flipkart_id
{
	
	private String emailid="contact@grotechminds.com";

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	private String password="java@123";
	
	public String getPassword() {
		return password;
		
	}
	
	public void setPassword(String password) {
		
		this.password=password;
		
	}
	
}

public class Assign74_Encapsulation {
	
	public static void main(String[] args) {
		
		Flipkart_id a1= new Flipkart_id();
		a1.setEmailid("swapna@gmail.com");
		System.out.println(a1.getEmailid());
		
		a1.setPassword("Minnu@123");
		System.out.println(a1.getPassword());
		
		
	}

}
