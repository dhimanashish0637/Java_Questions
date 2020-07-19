import java.util.*;
class input
{
void input(int a[])
{
int i;
for(i=0;i<a.length;i++)
{
Scanner S=new Scanner(System.in);
a[i]=S.nextInt();
}
}
double avg(int a[])
{
int i;
double s=0,b;
for(i=0;i<a.length;i++)
{
s=s+a[i];
}
b=s/a.length;
return b;
}
public static void main(String x[])
{
int arr[],n;
int a;
double k;
input ob=new input();
Scanner Sc=new Scanner(System.in); 
System.out.print("Enter Number:");
n=Sc.nextInt();
arr=new int[n];
ob.input(arr);
k=ob.avg(arr);
System.out.print(k);
}
}