import java.util.*;
abstract class single1
{  
single1()
{
System.out.println("Dhiman");
}
abstract void show();
}  
final class single2 
{  
single2()
{
System.out.println("Ashish");
} 
}  
class Test1 extends single1
{  
Test1()
{
	show();
	//single1();
}
void show()
{
	System.out.println("Hello World");
}
public static void main(String args[])
{  
new Test1();
//show();
}
}  
