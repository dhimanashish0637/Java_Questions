import java.util.*;
class duplicate
{
public static void main(String args[])
{
int n,i,j,a,b;
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(arr[i]==arr[j] && i!=j)
{
arr[j]=0;
}

}
System.out.print(arr[i]);
}
}}