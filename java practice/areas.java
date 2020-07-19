import java.util.*;
class areas
{
	void calculate(double l,double w,double r)
	{
		System.out.println("The area of rectangle: "+(l*w));		
		System.out.println("The parameter of rectangle: "+2*(l+w));
		System.out.println("The area of circle: "+(3.141*r*r));
		System.out.println("The parameter of circle: "+2*r*3.141);
	} 
	public static void main(String x[])
	{
		double l,w,r,p=3.141,a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		l=s.nextDouble();
		System.out.println("Enter the width of rectangle: ");
		w=s.nextDouble();
		System.out.println("Enter the radius of circle: ");
		r=s.nextDouble();	
		areas ob=new areas();
		ob.calculate(l,w,r);
	}
}