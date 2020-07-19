import java.util.*;
class jagg2
{
	public static void main(String x[])
	{
		int l,i;
		String st;
        char a[][]=new char[4][];
        for(i=0;i<a.length;i++)
        {
        Scanner sc=new Scanner(System.in);
		st=sc.nextLine();
		l=st.length();
		a[i]=new char[l+1];
		a[i]=st.toCharArray();
        }
        for(char m[]:a)
		{
			for(char n:m)
			{
				System.out.print(n);
			}
				System.out.println();
		}

	}
}