import java.util.*;
public class Q1_LuckyNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try
        {
            if (n >= 0)
                System.out.println("Lucky Number");
            else
            {
                sc.close();         //Because of minor error, this syntax is added
                throw new NumberFormatException("Not a lucky number");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}
