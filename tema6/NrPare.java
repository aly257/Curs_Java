package tema6;

import java.util.*;

public class NrPare {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti 10 numere:");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Nr. " + (i+1) + ":");
			array[i] = scan.nextInt();
		}
		
		System.out.println("Afisare numere pare cu for:");
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) 
				System.out.println(array[i]);
		}
		
		System.out.println("Afisare numere pare cu while:");
		int j = 0;
		while(j < array.length) {
			if(array[j]%2 == 0)
			{
				System.out.println(array[j]);
			}
			++j;
		}

	}

}
