package tema3;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		
		System.out.println("Introdu factura:");
		Scanner scan  = new Scanner(System.in);
		int factura = scan.nextInt();
		scan.close();
		
		int discount = (factura>100)?10:5;
		
		double nouaValoare = factura - factura*discount/100;
		
		System.out.println("Noua valoare este " + nouaValoare);
	}

}
