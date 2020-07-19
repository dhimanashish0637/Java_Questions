import java.util.*;
import java.io.*;
import java.net.*; 
class server
{
public static void main(String x[])
{
	try
	{
ServerSocket ss=new ServerSocket(1234);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
System.out.print(dis.readUTF());
dis.close();
s.close();
ss.close();

}
catch(Exception e)
{	System.out.println(e);
}
}
}