import java.util.*;
class qwerty
{
public static void main(String args[])
{
String str,reverse="",a,b="ashish";

Scanner sc=new Scanner(System.in);
str=sc.next();
/*for(int i = str. length() - 1; i >= 0; i--)
{
reverse = reverse + str. charAt(i);
}
System.out.println(reverse);

System.out.println("Enter passward");
a=sc.next();
for(int i=0;i<a.length();i++)
{  
System.out.println(a.charAt(i+2));
}*/
char arr[]=str.toCharArray();

for(int i=0;i<arr.length;i++)
{
	arr[i]+=2;
	System.out.print(arr[i]);
}

if(b.compareTo(str)==str.compareTo(b))
{
	System.out.print("passward acepted");
}
else
{
	System.out.print("wrong");
}
for(int i=0;i<arr.length;i++)
{
	arr[i]-=2;
	System.out.print(arr[i]);
}
}
}