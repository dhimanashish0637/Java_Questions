import java.util.*;
import java.io.*;
import java.net.*; 
class client
{
public static void main(String x[])
{         
try {                                                                                                                
Socket s=new Socket("192.168.43.114",1234);
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
dos.writeUTF("hello");
dos.close();
s.close();
}
catch(Exception e){System.out.print(e);}
}
}
