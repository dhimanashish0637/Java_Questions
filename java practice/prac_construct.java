import java.util.*;
class prac_construct
{
	int age;
	String name;
	double marks;
	prac_construct(int age,String name,double marks)
	{
    this.age=age;
    this.name=name;
    this.marks=marks;
    //System.out.println("Hello");
	}
	void display()
	{
		System.out.println("Age:" +age);
		System.out.println("Name:" +name);
		System.out.println("Marks:" +marks);
	}
	public static void main(String x[])
	{
		int age;
		String name;
		double marks;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		name=sc.next();
		marks=sc.nextDouble();
		prac_construct ob=new prac_construct(age,name,marks);
		ob.display();
	}
}