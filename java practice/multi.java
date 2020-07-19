import java.util.*;
class multi2
{
	multi2()
	{
		System.out.println("Ashwani ");
	}
}
class multi1 extends multi2
{
	multi1()
	{
		System.out.println("Hello");
	   // m2();
	}
}
class multi extends multi1
{
	/*multi()
	{
	//m1();
	//m2();
}
*/
	public static void main(String x[])
	{
		new multi();
	}
}