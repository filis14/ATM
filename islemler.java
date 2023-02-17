package projem;
import java.util.Scanner;

public class islemler {

	
	public void calis(hesap hesap) {
		
		login login1=new login();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to ATM");
		System.out.println("***********************");
		int hak=3;
		
		
		while(true) {
			if(login1.login(hesap)) {
				
				break;
			}
			else {
				System.out.println("It was not logged in..");
				hak--;
				if(hak==0) {
					System.out.println("Your account has bloked..");
					return; //döngünün sonlanması için
				}
				
		}
		
	}
	System.out.println("*****************************");
	
	String islemler="1-Show balance\n"
			+"2-To deposit money\n"
			+"3-Withdraw money\n"
			+"4-Exit";
	
	System.out.println(islemler);
	System.out.println("***********************");
	
	
	while(true) {
		String chooice= sc.nextLine();
		
		if(chooice.equals("4")) {
			System.out.println("Your account has been logged out..");
			break;
		}
		
		else if(chooice.equals("1")) {
			System.out.print("Your balance is:"+hesap.getRemainder());
		}
		
		else if(chooice.equals("2")) {
			System.out.print("Amount for deposit:");
			int amountt= sc.nextInt();
			hesap.deposit(amountt);
			
		}
		
		else if(chooice.equals("3")) {
			System.out.print("Amount for pull:");
			int amount= sc.nextInt();
			hesap.pull(amount);
		}
		else {
			System.out.println("Enter a valid number.");
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
