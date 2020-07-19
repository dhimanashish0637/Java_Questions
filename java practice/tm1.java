import java.util.*;
class tm1
{
	void s(int a,float b)
	{
		System.out.println("Fun 1");
	}
	void s(int a,double b)
	{
		System.out.println("Fun 2");
	}
	public static void main(String x[])
	{
		tm1 ob=new tm1();
		ob.s(2,9.1);
		ob.s(2,9.1f);

	}
}