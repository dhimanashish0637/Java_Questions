import java.util.*;
class tm
{
void s(int a,int b)
{
System.out.println("Fun1");
}
void s(int a,char b)
{
System.out.println("Fun2");
}
void s(int a,float b)
{
System.out.println("aaa");
}
void s(int a,double b)
{
System.out.println("bb");
}	
public static void main(String [] args)
{
tm ob=new tm();
ob.s(1,2);
ob.s('A',23);
ob.s('S','a');
ob.s(2,9.1);
}
}