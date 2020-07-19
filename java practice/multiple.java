import java.util.*;
interface m1
{
	int a=5;
	default void show()
	{
		System.out.print("interface");
	}
}
class p1
{
	p1()
	{
		System.out.print("Hello");
	}
}
class multiple extends p1 implements m1
{
	public void show()
	{
		System.out.print("SHOW");
	}
	public static void main(String x[])
	{  
     multiple o= new multiple();
     super.show();
	}
}