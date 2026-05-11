public class Q8_Power {
    public static int power(int x,int n)
    {
        if (n == 0)
            return 1;
        else
            return x * power(x,n-1);
    }

    public static void main(String args[])
    {
        System.out.println("Value of 2 to the power 5 = "+power(2,5));
    }
}
