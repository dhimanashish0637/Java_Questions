import java.io.*;
import java.net.*;	
import java.util.Scanner;
public class serverhalfduplex 
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			String str="";
			ServerSocket ss =new ServerSocket(1000);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			while(true)
			{ 
				System.out.println(dis.readUTF());
				str=sc.nextLine();
				dout.writeUTF(str);
				dout.flush();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

