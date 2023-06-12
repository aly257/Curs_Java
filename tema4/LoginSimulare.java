package tema4;

import java.util.*;

public class LoginSimulare {
	String expectedUser = "TestUser";
	int expectedPassword = 1234;
	
	String user;
	int password;
	Scanner scan  =  new Scanner(System.in);
	
	public static void main(String[] args) {
		LoginSimulare obj = new LoginSimulare();
		obj.verifyCredentials();
	}
	
	public void getUser() {
		System.out.println("Enter a user: ");
		user = scan.next();
	}
	
	public void getPassword() {
		System.out.println("Enter a password: ");
		password = scan.nextInt();
	}
	
	public void verifyCredentials() {
		int i = 0;
		
		do {
			boolean validare = true;
			
			getUser();
			getPassword();

			
			if(!user.equals(expectedUser) || password != expectedPassword ) {
				validare = false;
			}
			
			if(validare) { 
				System.out.println("Login successful");
				break;}
			else {
				System.out.println("Login error");
			}
			
			i++; 
			
		} while(i < 3);
		
		if(i == 3 ) {
			System.out.println("Maximum attempts reached. User blocked");
		}
	}
	
	
}
