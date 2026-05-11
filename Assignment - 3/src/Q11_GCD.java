public class Q11_GCD {
    public static int gcd(int m,int n)
    {
        if (m % n == 0)
            return n;
        else
            return gcd(n,m%n);
    }
    public static void main(String[] args) {
        System.out.println("GCD of 20 is: "+gcd(5,20));
    }
}

//fibonacci
//binary
//fact