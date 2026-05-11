public class Q13_BinaryEquivalent {
    public static String binary(int n)
    {
        if (n == 0)
            return "";
        else
            return binary(n/2) + n%2;
    }

    public static void main(String[] args) {
        System.out.println("Binary equivalent of 13 is: "+binary(13));
    }
}
