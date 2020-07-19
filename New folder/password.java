package check_password;
import java.util.Scanner;

public class CheckPassword 
{
	public static void main(String[] args) 
	{
		int bigCharCounter = 0, numCounter = 0, smallCharCounter = 0;
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		showRules();
		System.out.println("Enter your password: ");
		while (true)
		{
			String userPassword = scan.nextLine();
			if (userPassword.length() >= 5 && userPassword.length() <= 12)
			{
				for (int i = 0; i <= userPassword.length() - 1; i++)
				{
					if ((int) userPassword.charAt(i) >= 48 && (int) userPassword.charAt(i) <= 57)
					{
						flag = false;
						bigCharCounter = 0;
						smallCharCounter = 0;
						numCounter++;
						if (numCounter >= 5)
							break;
					}
					
					else if ((int) userPassword.charAt(i) >= 65 && (int) userPassword.charAt(i) <= 90)
					{
						flag = false;
						numCounter = 0;
						smallCharCounter = 0;
						bigCharCounter++;
						if (bigCharCounter >= 5)
							break;
					}
					
					else if ((int) userPassword.charAt(i) >= 97 && (int) userPassword.charAt(i) <= 122)
					{
						flag = false;
						numCounter = 0;
						bigCharCounter = 0;
						smallCharCounter++;
						if (smallCharCounter >= 5)
							break;
					}
					
					else 
					{
						numCounter = 0;
						bigCharCounter = 0;
						smallCharCounter = 0;
						flag = true;
						break;
					}
				}
				if (numCounter < 5 && bigCharCounter < 5 && smallCharCounter < 5  && !flag)
					System.out.println("Valid Password");
				else if (numCounter >= 5 || bigCharCounter >= 5 || smallCharCounter >= 5 && !flag)
					System.out.println("Invalid Password: Rule 3");
				else if (flag)
					System.out.println("Invalid Password: Rule 2");
				System.out.println(numCounter + ", " + bigCharCounter + ", " + smallCharCounter + ", " +  flag);
			}
			else
				System.out.println("Invalid Password: Rule 1");
		}
	}
	
	public static void showRules()
	{
		System.out.println("Password Rules:\r\n" + 
				"1. A password must be between 5 to 12 characters long.\r\n" + 
				"2. Only letters and digits are allowed in a password.\r\n" + 
				"3. A password must not contain 5 or more letters or digits in\r\n" + 
				"sequence.");
	}
}