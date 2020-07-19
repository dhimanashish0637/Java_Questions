import java.util.*;
class coun
{
int arr[]=new int[100],count=0,a;
int n,i,j;
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
a=arr[i];
sc.nextInt(a);
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(arr[i]==arr[j]);
{
count++;
}}
}
System.out.print(count);
}}