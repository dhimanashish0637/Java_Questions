import java.util.*;
class const1
{
int age;
String name;
double marks;
const1(int age,String name,double marks)
{
this.. age=age;
this.name=name;
this.marks=marks;
}
void display()
{
System.out.println("NAme is "+name);
System.out.println("Age is "+age);
System.out.println("Marks is "+marks);
}
public static void main(String []args)
{
int a;
double b;
String c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
c=sc.next();
b=sc.nextDouble();
const1 co=new const1(a,c,b);
co.display();
}
}
