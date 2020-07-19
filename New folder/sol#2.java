//package test;
import java.util.Random;

class Test
{	
	public static void main(String args[])
	{
		Random random = new Random();
		String  str = "abcdefghijklmnopqrstuvwxyz";
        int r = random.nextInt(26 - 1) + 1;
        System.out.println("Number genrerated: " + r);
        System.out.println("Converted letter: " + str.charAt(r - 1));
        switch(str.charAt(r - 1))
        {
        	case 'a':
        	case 'b':
        	case 'c':
        		System.out.println("Keypad number: " + 2);
        		break;
        	case 'd':
        	case 'e':
        	case 'f':
        		System.out.println("Keypad number: " + 3);
        		break;
        	case 'g':
        	case 'h':
        	case 'i':
        		System.out.println("Keypad number: " + 4);
        		break;
        	case 'j':
        	case 'k':
        	case 'l':
        		System.out.println("Keypad number: " + 5);
        		break;
        	case 'm':
        	case 'n':
        	case 'o':
        		System.out.println("Keypad number: " + 6);
        		break;
        	case 'p':
        	case 'q':
        	case 'r':
        	case 's':
        		System.out.println("Keypad number: " + 7);
        		break;
        	case 't':
        	case 'u':
        	case 'v':
        		System.out.println("Keypad number: " + 8);
        		break;
        	case 'w':
        	case 'x':
        	case 'y':
        	case 'z':
        		System.out.println("Keypad number: " + 9);
        		break;
        }
	}
}