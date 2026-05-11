import java.util.*;
public class Q5_SumOfDigits
{
    public static int sumOfDigits_tillSingleDigit(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 9)
            return sumOfDigits_tillSingleDigit(sum);
        return sum;
    }

    public static void main(String atgs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits_tillSingleDigit(n));
        sc.close();
    }
}