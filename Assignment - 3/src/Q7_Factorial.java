
public class Q7_Factorial {
    public static int fact(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * fact(n-1);
    }

    public static void main(String args[])
    {
        System.out.println("Factorial of 5: "+fact(5));
    }
}
