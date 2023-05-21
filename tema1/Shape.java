package tema1;

public class Shape {
	public int calculateSquareArea(int lenght){ return lenght * lenght;}
	
	public int calculateRectangleArea(int lenght, int width) { return lenght * width;}
	
	public Shape (int lenght) {
		System.out.println("The area of the square is: " + calculateSquareArea(lenght));
	}
	
	public Shape(int lenght, int width) {
		System.out.println("The area of the rectangle is: " + calculateRectangleArea(lenght, width));
	}
	
	public Shape(double radius) {
		System.out.println("The area pf the circle is: " + radius * radius * Math.PI);
	}
}
