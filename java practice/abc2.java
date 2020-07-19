import java.util.*;
class abc2
{
int a,b;
static int count;
int sum()
{

return a+b;
}
public static void main(String x[])
{
abc2 ob=new abc2();
Scanner sc=new Scanner(System.in);
ob.a=sc.nextInt();
ob.b=sc.nextInt();
int c=ob.sum();
System.out.print(c);
}
}