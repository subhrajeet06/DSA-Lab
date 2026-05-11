import java.util.*;
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String message) {
        super(message);
    }
}


public class Q3_Student {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter marks: ");
        double marks = sc.nextDouble();
        try{
            if (marks > 100)
            {
                sc.close();
                throw new MarksOutOfBoundException("Marks cannot be greater than 100");
            }
            else if (marks < 0)
            {
                sc.close();
                throw new MarksOutOfBoundException("Marks cannot be less than 0");
            }
            else
                System.out.println("Name: " + name + "\nMarks: " + marks); 
        }
        catch (MarksOutOfBoundException e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}
