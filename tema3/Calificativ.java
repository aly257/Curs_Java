package tema3;

import java.util.Scanner;

public class Calificativ {
	public static void main(String[] args) {
		
		System.out.println("Introdu punctajul:");
		Scanner scan  = new Scanner(System.in);
		int punctaj = scan.nextInt();
		scan.close();
		
		String calificativ = (punctaj>=90)?"FB":(punctaj<90&&punctaj>=80)?"B":"S";
		
		if(calificativ == "FB") System.out.println("Ai primit: Foarte bine");
		else if (calificativ == "B")System.out.println("Ai primit: Bine");
		else System.out.println("Ai primit: Suficient");
	}

}
