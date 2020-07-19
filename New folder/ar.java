import java.util.*;
class ar
{
public static void main(String args[])
{
float width,height,radius;
Scanner sc=new Scanner(System.in);
System.out.println("enter the width of rectangle");
width=sc.nextFloat();
System.out.println("enter the height of rectangle");
height=sc.nextFloat();
System.out.println("enter the radius of rectangle");
radius=sc.nextFloat();
parameter(width,height);
circle(radius);
}
public static void parameter(float width,float height)
{
	System.out.println("Area of rectangle = "+(width * height));

System.out.println("Perimeter of rectangle ="+ (2 * width + 2 * height));
}
public static void circle(float radius)
{
	System.out.println("Area of circle = "+ (3.141 * radius * radius));
System.out.println("Perimeter of circle = "+ (2 * radius * 3.141));

}
	


}