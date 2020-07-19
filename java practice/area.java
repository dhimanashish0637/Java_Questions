import java.util.*;
class area
{
	void CalculateArea(int l,int w)
	{
		System.out.println(l*w);
	}
    void Calculatepara(int l,int w)
	{
		System.out.println(l*w);
	}
    void CalculateArea(double r)
	{
		System.out.println(3.141*r*r);
	}
	void Calculatepara(double r)
	{
		System.out.println(3.141*2*r);
	}
	public static void main(String x[])
	{
		int l,w;
		double r;
		Scanner s=new Scanner(System.in);
        area ob=new area();
		System.out.println("Enter the length of rectangle: ");
		l=s.nextInt();
		System.out.println("Enter the width of rectangle: ");
		w=s.nextInt();
		System.out.println("Enter the radius of circle: ");
		r=s.nextDouble();
		System.out.println("The area of rectangle: ");
		ob.CalculateArea(l,w);		
		System.out.println("The parameter of rectangle: ");
		ob.Calculatepara(l,w);
		System.out.println("The area of circle: ");
		ob.CalculateArea(r);
		System.out.println("The parameter of circle: ");
		ob.Calculatepara(r);
	}
}