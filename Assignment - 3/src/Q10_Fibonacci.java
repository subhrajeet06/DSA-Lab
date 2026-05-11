public class Q10_Fibonacci {
    public static int fibonacci(int n)
    {
        if (n <= 2)
            return n-1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println("5th Fibonacci Number: "+fibonacci(6));
    }
}