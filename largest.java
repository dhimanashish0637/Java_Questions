import java.util.*;
class largest
{
public static void main(String X[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c)
System.out.print("Largest number is "+a);
if(b>a&&b>c)
System.out.print("Largest number is "+b);
else
System.out.print("Largest number is "+c);
}}