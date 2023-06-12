package tema6;

import java.util.*;

public class CalificareProfesor {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Course subject: ");
		String course = scan.nextLine();

		System.out.println("Experience: ");
		int experience = scan.nextInt();

		scan.nextLine();

	    System.out.println("Available time: ");
	    String time = scan.nextLine();

	    Qualification checkQualify = new Qualification(course, experience, time);

	    checkQualify.verify();
	}

}
