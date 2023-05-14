package curs1;

public class FirstClass {
	
	public String name = "Oana"; //variabila de instanta
	public int age;

	public static void main(String[] args) {
		
		String prenume = "Ion"; //variabila locala
		
		FirstClass obj = new FirstClass();
		
		System.out.println(obj.age);

		obj.age = 20;
		System.out.println(obj.age);
		
		System.out.println("TEST");
		System.out.println(prenume);
		System.out.println(obj.name);

	}

}
