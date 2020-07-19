import java.util.*;
class occurences
{
	public static void main(String args[])
	{
		int n,x=-1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		int ar[]=new int[1000];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			ar[arr[i]]++;
			if(x<arr[i])
			{
				x=arr[i];
			}
		}
		for(i=0;i<=x;i++)
		{
         if(ar[i]==0)
         continue;
         else
         {
         	System.out.println("Number "+i+" has "+ar[i]+" occurences ");
         } 
		}
	}
}