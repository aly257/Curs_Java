package tema3;

import java.util.*;

public class TablaInmultirii {
	public static void main(String[] args) {
		
		System.out.println("Introdu numarul a carui tabla a inmultirii o doresti:");
		Scanner scan  = new Scanner(System.in);
		int numar = scan.nextInt();
		scan.close();
		
		for(int i = 1; i< 11; i++) 
			System.out.println(numar + " * " +  i + " = " +numar*i);
	
	}
}
