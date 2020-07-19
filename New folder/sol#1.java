import java.util.Scanner;

class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        String name = "";
        String code = "";
        String major = ""; 
        String location = "";
        System.out.println("Enter student name: ");
        name = scan.next();
        System.out.println("Enter the code: ");
        code = scan.next().toUpperCase();
        System.out.println("Student: " + name);
        if(code.charAt(0) == 'M')
            major = "Mathematics"; 
        else if(code.charAt(0) == 'C')
            major = "Computer Science"; 
        else if(code.charAt(0) == 'I')
            major = "Information Technology"; 
        else if(code.charAt(0) == 'P')
            major = "Physics"; 
        else
        {
            System.out.println("Incorrect code");
            System.exit(0);
        }
        
        if(code.charAt(2) == 'B')
            location = "Brampton";
        else if(code.charAt(2) == 'O')
            location = "Oakville";
        else if(code.charAt(2) == 'M')
            location = "Mississauga";
        else
        {
            System.out.println("Incorrect code");
            System.exit(0);
        }
        
        System.out.println("Major: " + major);
        System.out.println("Campus: " + location);
    }
}