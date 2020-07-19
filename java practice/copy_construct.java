import java.util.*;
class copy_construct
{
	int age;
	String name;
	double marks;
	copy_construct()
	{
  /*  this.age=age;
    this.name=name;
    this.marks=marks;
    //System.out.println("Hello");
	*/}
	copy_construct(copy_construct s)
	{
		age=s.age;
		name=s.name;
		marks=s.marks;
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
		copy_construct ob=new copy_construct();
		copy_construct ob2=new copy_construct(ob);
		ob2.display();
	}
}