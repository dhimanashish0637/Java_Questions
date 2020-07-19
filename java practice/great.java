import java.util.*;
class great
{
public static void main(String x[])
{
int a,b,c;
Scanner Sc=new Scanner(System.in);
System.out.print("Enter Number:");
a=Sc.nextInt();
System.out.print("Enter Number:");
b=Sc.nextInt();
System.out.print("Enter Number:");
c=Sc.nextInt();
if(a>b && a>c)
{
System.out.print("a is greatest");
}
else if(b>a && b>c)
{
System.out.print("b is greatest");
}
else
{
System.out.print("c is greatest");
}
}
}