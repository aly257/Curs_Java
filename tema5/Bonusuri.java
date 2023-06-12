package tema5;

import java.util.*;

public class Bonusuri {
	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		int bonus = 0;
		
		System.out.println("Te rog introdu anul de vechime:");
		int anVechime = scan.nextInt();
		
		switch(anVechime) {
		case 1: bonus = 100;
		break;
		case 2: bonus = 200;
		break;
		case 3:
			System.out.println("Te rog introdu valoarea vanzarilor efectuate:");
			int vanzari = scan.nextInt();
			
			System.out.println("Te rog luna in care au fost efectuate vanzarile(1-12):");
			int luna = scan.nextInt();
			
			if(vanzari <= 5000) bonus = 400;
			else if (vanzari <= 10000 && luna <= 6) bonus = 800;
			else if (vanzari <= 10000 && luna >= 7 && luna <= 11) bonus = 1000;
			else if (vanzari <= 10000 && luna == 12) 
			{
			bonus = 900;
			System.out.println("In decembrie vanzarile se vand singure!");
			}
			else if (vanzari >1000) bonus = 1200;
		break;
		default: System.out.println("Introdu alte valori!");
		}
		
		System.out.println("Valoare bonus: " + bonus);
	}
}
