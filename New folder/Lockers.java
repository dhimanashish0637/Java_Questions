package lockers;

public class Lockers 
{
	public static void main(String[] args) 
	{
		boolean array[] = new boolean[50];
		for (int ol = 0; ol <= array.length - 1; ol++)
		{
			for (int il = ol; il <= array.length - 1;)
			{
				if (ol == 0)
					array[il] = true;
				else if (ol == 1)
				{
					if (il == ol)
						array[il] = true;
					else
						array[il] = false;
				}
				else
				{
					if (il == ol)
						array[il] = true;
					else
					{
						if(array[il] == false)
							array[il] = true;
						else
							array[il] = false;
					}				
				}				
				if (ol <= 1)
					il++;
				else
					il = il + ol + 1;
			}
		}
		for (int loop = 0; loop <= array.length - 1; loop++)
			if(array[loop])
				System.out.println("Locker L" + (loop + 1) + " is open");
			else
				System.out.println("Locker L" + (loop + 1) + " is closed");
	}
}