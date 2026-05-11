public class Q14_Product {
    public static int product(int m,int n)
    {
        if (n == 0)
            return 0;
        else
            return m + product(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println("2 * 3 = "+(product(2,3)));
    }
}
