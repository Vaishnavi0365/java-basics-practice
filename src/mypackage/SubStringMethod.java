package mypackage;

import java.util.Scanner;

public class SubStringMethod {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		String email;
		String username;
		String domain;
		
		System.out.print("Enter your Email: ");
		email = scanner.nextLine();
		
		if(email.contains("@")) {
			username = email.substring(0 , email.indexOf("@"));
			domain = email.substring(email.indexOf("@")+1);
			
			System.out.println("Your email: " + email);
			System.out.println("Username: "+ username);
			System.out.println("Domain: " + domain);
			
		} else {
			
			System.out.println("Email must contain @");
		}
		
	}

}
