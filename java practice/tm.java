import java.util.*;
class tm
{
	void s(int a,int b)
	{
		System.out.println("Fun 1");
	}
	void s(int a,char b)
	{
		System.out.println("Fun 2");
	}
	public static void main(String x[])
	{
		tm ob=new tm();
		ob.s(1,2);
		ob.s('A',23);
		ob.s('A','a');
		ob.s(2,7.2f);
	}
}