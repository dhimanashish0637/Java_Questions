import java.util.*;
class string
{
	public static void main(String x[])
	{
		int a;
		String name,name1,name2;
		Scanner s=new Scanner(System.in);
		name=s.next();
		name1=s.next();
		//=s.nextInt();
		//char ch=name.charAt(a);
        name2=name.concat(" ").concat(name1);
		//System.out.println(ch);
		System.out.println(name2);
	}
}