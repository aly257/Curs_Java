package tema4;

public class SecventaFibonacci {
	public static void main(String[] args) {
		
		int secventa = 9;
		
		FibonacciCuFor(secventa);
		System.out.println();
		FibonacciCuWhile(secventa);
	}
	
	public static void FibonacciCuFor(int secventa) {
		int penultimul = 0;
		int ultimul = 1;
		int suma = 0;
		
		System.out.print("Seria Finbonacci pentru 9 numere: " + penultimul + " " + ultimul + " ");
		
		for (int i = 0; i < secventa - 2; i++) {
			suma = penultimul + ultimul;
			System.out.print(suma + " ");
			penultimul = ultimul;
			ultimul = suma;
		}
	}
	
	public static void FibonacciCuWhile(int secventa) {
		int penultimul = 0;
		int ultimul = 1;
		int suma = 0;
		
		System.out.print("Seria Finbonacci pentru 9 numere: " + penultimul + " " + ultimul + " ");
		
		while (secventa > 2) {
			suma = penultimul + ultimul;
			System.out.print(suma + " ");
			penultimul = ultimul;
			ultimul = suma;
			secventa--;
		}
	}
}
