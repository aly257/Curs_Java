package tema3;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		int suma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Please enter number " + (i+1) + ":");
			Scanner scan  = new Scanner(System.in);
			suma += scan.nextInt();
		}
		
		System.out.println("The sum of numbers is " + suma);	
	}
}
