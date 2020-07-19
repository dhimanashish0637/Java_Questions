import java.util.*;
class comp
{
public static void main(String args[])
{
String a="Ashish  ";
String b;
a=a.trim();
Scanner sc=new Scanner(System.in);
b=sc.next();

int i=b.indexOf("Ashish");
String d=b.substring(i,i+5);

	System.out.println(a.equalsIgnoreCase(d));

}
}

