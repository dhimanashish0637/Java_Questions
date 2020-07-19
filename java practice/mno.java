import java.util.*;
class mno
{
	int n1,n2,n4;
	static int n3;
	void set(int n1,int n5,int n3)
	{
     this.n1=n1*n1;
     n2=n5*n5;
     this.n3=n3*n3;
	}
	public static void main(String x[])
	{
		Scanner Sc=new Scanner(System.in);
		int a,b,c;
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
		mno ob=new mno();
		ob.set(a,b,c);
		//n4=n4+2;
		System.out.println(n4);
		System.out.println(ob.n1);
		System.out.println(ob.n2);
		System.out.println(ob.n3);
	}
}