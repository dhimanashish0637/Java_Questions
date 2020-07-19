import java.util.*;
class mno
{
int n1,n2;
void set(int n1,int n5)
{
n1=n1*n1;
n2=n5*n5;
}
public static void main(String []args)
{
mno ob=new mno();
ob.set(5,6);
System.out.println(ob.n1);
System.out.println(ob.n2);
}
}