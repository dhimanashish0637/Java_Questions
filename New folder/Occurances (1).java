package test;
import java.util.Scanner;

public class Test
{  
	public static void main(String args[])
	{  
		Scanner scan = new Scanner(System.in);
		int occurance = 0, loc = 0, num = 9999, integerArray[] = new int[100];
		System.out.println("Enter the integers between 1 and 100: ");
		while (loc <= 100)
		{
			num = scan.nextInt();
			if (num != 0)
				integerArray[loc] = num;
			else
				break;
			loc++;
		}
		for (int j = 0; j <= loc - 1; j++)
		{
			for (int k = j; k <= loc - 1; k++)
			{
				if (integerArray[j] == integerArray[k])
				{
					occurance++;
					if (occurance > 1)
						integerArray[k] = 0;
				}
			}
			if (integerArray[j] != 0)
				System.out.println(integerArray[j] + " occurs " + occurance + " times");
			occurance = 0;
		}				
	}  
}  