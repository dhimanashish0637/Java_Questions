import java.util.*;
class reverse
{
public static void main(String x[])
{
int a,r,s=0;
Scanner Sc=new Scanner(System.in);
System.out.print("Enter Number");
a=Sc.nextInt();
while(a!=0)
{
r=a%10;
s=s*10+r;
a=a/10;
}
System.out.print("Reverse Number:" +s);
}
}