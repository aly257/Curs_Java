package curs3;

import java.util.Scanner;

/*
 * Facem un program care intreaba utilizatorul 3 numere
 * Verificam care dintre cele 3 nr e cel mai mare si l printam
 * Daca 2 nr sunt egale printam
 * some numbers are equal
 * Ex: First number is the greatest!
 */

public class GreatestOfThreeNumber {
	//int number1, number2, number3;
	int number1;
	int number2;
	int number3;
	
	public void askTheNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		number1 = scan.nextInt();
		System.out.println("Please enter the second number:");
		number2 = scan.nextInt();
		System.out.println("Please enter the third number:");
		number3 = scan.nextInt();
		scan.close();
	}
	
	public void compareTheNumbers() {
		askTheNumbers();
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("First number is the greatest!");
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("Second number is the greatest!");
		}else if(number3 > number1 && number3 > number2) {
			System.out.println("Third number is the greatest!");
		}else {
			System.out.println("Some numbers are equal!");
		}
		
		
		}
	

}
