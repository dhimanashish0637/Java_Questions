import java.util.*;
class const
{
int age;
String name;
double marks;
const(int age,String name,double marks)
{
this.age=age;
this.name=name;
this.marks=marks;
}
void display()
{
System.out.println("NAme is "+name);
System.out.println("NAme is "+age);
System.out.println("NAme is "+marks);
}
public static void main(String []args)
{
int a;
double b;
string c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
c=sc.next();
b=sc.nextDouble();
const co=new const(a,c,b);
co.display();
}
}
