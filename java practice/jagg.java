import java.util.*;
class jagg
{
	public static void main(String x[])
	{
		int k=1,count;
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int a[][]=new int[num][];
		for (int i=0;i<a.length;i++)
		{
			a[i]=new int[k];
			k=k+2;
		}
		for(int i=0;i<a.length;i++)
		{
			count=3;
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count;
				count+=3;
			}
		}
		for(int m[]:a)
		{
			for(int n:m)
			{
				System.out.print(n+" ");
			}
				System.out.println();
		}
	}
}