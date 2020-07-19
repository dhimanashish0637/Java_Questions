import java.util.*;
import java.io.*;
import java.net.*;
public class clienthalfduplex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str="";
		try
		{
			Socket s=new Socket("localhost",1000);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			while(true)
			{
				str=sc.nextLine();
				dos.writeUTF(str);
				dos.flush();
				System.out.println(din.readUTF());
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}