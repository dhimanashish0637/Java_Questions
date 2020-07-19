import java.util.*;
class string_comp
{
	public static void main(String x[])
	{
	String a,b,str,c,d;
	int f;
	a="arshnoor@123";
	/*a=a.concat("String")
	System.out.println(a);
	*/
	d="1610991182";
	f=a.length();
	System.out.println(f);
	Scanner s=new Scanner(System.in);
	System.out.println("ID:");
	c=s.nextLine();
	System.out.println("Password:");
	b=s.nextLine();
    if(b.length()>=5 && b.length()<=12)
	{
	if(b.contains("@"))
	{
	    if(a.equals(b) && d.equals(c))
	    {
		System.out.print("Password Accepted");
	    }
	    else
		System.out.print("User Not Identifed");
    }
    else
    	System.out.print("Special Character missing");
    
    }
    else
    {
	    System.out.print("Insufficient Password");
    }
    }
}