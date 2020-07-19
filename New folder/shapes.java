package shapes;

import java.util.Scanner;
public class Shapes 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		int length = scan.nextInt();
		System.out.println("Enter the width of the rectangle: ");
		int width = scan.nextInt();
		System.out.println("Enter the radius of the rectangle: ");
		int radius = scan.nextInt();
		
		System.out.println("The area of the rectangle = " + calculateArea(length, width));
		System.out.println("The perimeter of the rectangle = " + calculatePerimeter(length, width));
		
		System.out.println("The area of the circle = " + calculateArea(radius));
		System.out.println("The perimeter of the circle = " + calculatePerimeter(radius));
	}
	
	public static float calculateArea(float w, float h)
	{
		return ((float) w * h);
	}
	
	public static float calculateArea(float r)
	{
		return (float) (3.141 * r * r);
	}
	
	public static float calculatePerimeter(float w, float h)
	{
		return ((2 * w) + (2 * h));
	}
	
	public static float calculatePerimeter(float r)
	{
		return (float) (2 * r * 3.141);
	}
}