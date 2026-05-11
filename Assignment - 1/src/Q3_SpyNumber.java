import java.util.*;
public class Q3_SpyNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while (n != 0)
        {
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        if (sum == prod)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
        sc.close();
    }
}