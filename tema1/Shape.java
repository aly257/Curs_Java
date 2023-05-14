package tema1;

public class Shape {
	public int calculateSquareArea(int lenght){ return lenght * lenght;}
	
	public int calculateRectangleArea(int lenght, int width) { return lenght * width;}
	
	public Shape (int lenght) {
		int squareArea = calculateSquareArea(lenght);
		System.out.println("The area of the square is: " + squareArea);
	}
	
	public Shape(int lenght, int width) {
		int rectangleArea = calculateRectangleArea(lenght, width);
		System.out.println("The area of the rectangle is: " + rectangleArea);
	}
	
	public Shape(double radius) {
		System.out.println("The area pf the circle is: " + radius * radius * Math.PI);
	}
}
