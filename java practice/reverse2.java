import java.util.*;q	a
class reverse2
{
int a,s=0,r;
int reverse()
{
while(a!=0)
{
r=a%10;
s=s*10+r;
a=a/10;
}
return s;
}
public static void main(String x[])
{
reverse2 ob=new reverse2();
Scanner Sc=new Scanner(System.in);
ob.a=Sc.nextInt();
int c=ob.reverse();
System.out.print("Reverse:" +c);
}
}