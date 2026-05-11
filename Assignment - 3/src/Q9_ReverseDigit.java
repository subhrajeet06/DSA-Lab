public class Q9_ReverseDigit {
    public static int reverse(int rev,int n)
    {
        if (n == 0)
            return rev;
        else
            return reverse((rev*10) + (n%10),n/10);
    }

    public static void main(String[] args) {
        System.out.println("Reverse of 9231 is: "+reverse(0,9231));
    }
}
