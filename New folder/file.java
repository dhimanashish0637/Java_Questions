import java.util.*;
import java.io.*;
import java.net.*;

class file
{
public static void main(String args[])
{
try
{
	File f=new File("C:\\Users\\DELL\\Desktop\\jai.txt");
FileOutputStream fos=new FileOutputStream(f);
fos.write();
fos.close();
System.out.print("hello");
}
catch(Exception e){System.out.print(e);}
}
}  