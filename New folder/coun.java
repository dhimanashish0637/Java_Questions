import java.util.*;
class coun
{
	public static void main(String args[])
	{
int arr[]=new int[100],count=0,a;
int n,i,j;

Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
n=sc.nextInt();
System.out.println("enter the size");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
}


}
System.out.println(arr[i]+ " is Occur " +count  +" Time in Array");
        count = 0;
}

}}