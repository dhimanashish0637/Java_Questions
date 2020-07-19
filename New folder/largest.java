import java.util.*;
class largest
{
public static void main(String args[])
{
int n,i,a,b;
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
b=arr[0];
for(i=0;i<n;i++)
{
	if(b<arr[i])
	{
		b=arr[i];
	}

}
System.out.println("Largest element is "+b);
for(i=0;i<n;i++)
{
	if(b>arr[i])
	{
		b=arr[i];
	}
}
System.out.println("Smallest element is "+b);
}
}

