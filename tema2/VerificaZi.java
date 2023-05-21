package tema2;

import java.util.*;

public class VerificaZi {
	int zi;
	
	public void intreabaZi() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce zi este astazi?");
		zi = scan.nextInt();
		scan.close();
	}
	
	public void evalueazaZi() {
		intreabaZi();
		if(zi==0) System.out.println("Te rog introdu un numar mai mare decat 0.");
		else if(zi==1) System.out.println("Astazi este luni");
		else if(zi==2) System.out.println("Astazi este marti");
		else if(zi==3) System.out.println("Astazi este miercuri");
		else if(zi==4) System.out.println("Astazi este joi");
		else if(zi==5) System.out.println("Astazi este vineri");
		else if(zi==6) System.out.println("Astazi este sambata");
		else if(zi==7) System.out.println("Astazi este duminca");
		else if(zi>7) System.out.println("Saptamana are doar 7 zile. Te rog sa introduci un nr. valid.");
	}

}
