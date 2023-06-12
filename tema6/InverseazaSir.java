package tema6;

import java.util.*;

public class InverseazaSir {
	
	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		int dim = IntreabaDimensiune();
		
		int[] array = new int[dim];
		
		for(int i = 0; i < dim; i++) {
			System.out.println("Introdu elementul " + (i+1) +":");
			array[i] = scan.nextInt();
		}
		
		InverseazaCuFor(array);
		//probabil pt ca am definit functiile cu public static
		//modificarile sunt vizibile la nivelul obiectului InverseazaSir
		//asa ca sirul este inversat, iar inversarea cu while il 
		//va aduce la forma sa initiala, inversandu-l din nou
		InverseazaCuWhile(array);
		
	}
	

	public static int IntreabaDimensiune() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Ce dimensiune trebuie sa aiba array-ul?");
		int dim = scan.nextInt();
		
		return dim;
	}
	
	public static void InverseazaCuFor(int[] sir) {
		int x;
		int n = sir.length;
        for (int i = 0; i < n / 2; i++) {
            x = sir[i];
            sir[i] = sir[n - i - 1];
            sir[n - i - 1] = x;
        }
        
        System.out.println("Sirul inversat cu for este: ");
        for (int i = 0; i < n; i++) {
            System.out.println(sir[i]);
        }
	}
	
	public static void InverseazaCuWhile(int[] sir) {
		int i = 0, x;
		int n = sir.length;
        while (i < n / 2) {
            x = sir[i];
            sir[i] = sir[n - i - 1];
            sir[n - i - 1] = x;
            i++;
        }
        
        System.out.println("Sirul inversat cu while este: ");
        for (int j = 0; j < n; j++) {
            System.out.println(sir[j]);
        }
	}
        
	

}
