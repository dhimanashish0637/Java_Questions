 import java.util.*;
 interface Printable
 {  
 void print();  
 }
interface Showable
{  
void show();  
}  
class mul implements Printable,Showable
{  

mul()
{
//	public void print()
//{
	System.out.println("Hello");
	//}  
//public void show()
//{
	System.out.println("Welcome");
	//}  
  
}

public static void main(String args[])
{  
mul m = new mul();  
  m.show();
 }  
}
  
 