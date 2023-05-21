package tema2;

import java.util.*;

public class VerificaVarsta {
	
	int varsta;
	
	public void intreabaVarsta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Care este varsta dumneavoastra?");
		varsta = scan.nextInt();
		scan.close();
				
	}
	
	public void evalueazaVarsta() {
		intreabaVarsta();
		if(varsta < 18) 
			System.out.println("Esti minor!");
			else if (varsta >= 18 && varsta < 66) 
			System.out.println("Esti adult!");
			 else System.out.println("Esti batran!");
	}

}
