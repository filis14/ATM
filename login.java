package projem;
import java.util.Scanner;

public class login {

Scanner sc= new Scanner(System.in);
	
public boolean login(hesap hesap) {
	
	System.out.print("Username:");
	String username2=sc.nextLine();
	System.out.print("Password;");
	String password2=sc.nextLine();
	
	if(hesap.getUsername().equals(username2) && hesap.getPassword().equals(password2)) {
		System.out.println("Your account was logged in..");
		return true;
			
	}
		
		else {
			
				System.out.println("Your username or password is wrong..");
		return false;
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

