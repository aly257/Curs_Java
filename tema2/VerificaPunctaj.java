package tema2;

import java.util.*;

public class VerificaPunctaj {
	int punctaj;
	
	public void intreabaPunctaj() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Care este punctajul obtinut la test?");
		punctaj = scan.nextInt();
		scan.close();
	}
	
	public void evalueazaPunctaj() {
		intreabaPunctaj();
		if(punctaj>=0 && punctaj<66) System.out.println("Ai picat. Mai incearca");
		else System.out.println("Felicitari. Ai trecut.");
	}

}
