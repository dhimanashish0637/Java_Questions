import java.util.*;
class comp1
{
  
public static void main(String args[]){  
String s1="Ashish@"; 
Scanner sc=new Scanner(System.in);
 
String s2;

s2=sc.next();
s2=s2.trim();  

if(s1.length()>=5 && s2.length()<=8)
{
if(s2.contains("@"))
{
System.out.println("true");
}
else
{
	System.out.print("not @");
}


}
else
{ 
System.out.println("wrong");
}
}
}  
