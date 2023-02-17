package projem;

public class hesap {
	
	
	private String username;
	private String password;
	private int remainder;
	
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	
	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	
	
	public void setRemainder(int remainder) {
		this.remainder=remainder;
	}
	public int getRemainder() {
		return remainder;
	}
	
	
	public hesap(String username, String password, int remainder) {
		this.username=username;
		this.password=password;
		this.remainder=remainder;
	}
	
	public void deposit(int amount) {
		remainder+=amount;
		System.out.println("Your current balance:" + remainder);
	}
	
	public void pull(int amount) {
		if(amount>remainder) {
			System.out.println("Please enter amount that smaller than your balance") ;
		}
		else {
			remainder-=amount;
			System.out.println("Yout current balance:" + remainder);
		}
	}
	
	
	
	
	
	

}
