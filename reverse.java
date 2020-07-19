import java.util.*;
class reverse
{
int a,b=0,r=0;
int rev()
{
while(a!=0)
{
b=a%10;
r=r*10+b;
a=a/10;
}
return r;
}
public static void main(String X[])
{
reverse ob=new reverse();
Scanner sc=new Scanner(System.in);
ob.a=sc.nextInt();
int c=ob.rev();
System.out.print("Reverse is "+c);

}
}