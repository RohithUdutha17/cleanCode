package cleancode;

public class User {
	String firstName;
	String lastName;
	String address;
	String mobileNumber;
	
	public User(String firstName,String lastName,String address,String mobileNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	public void register() {
		System.out.println("User registered successfully");
	}
	
	public void login() {
		System.out.println("User logged in successfully taking you to application");
	}
	
	
}
