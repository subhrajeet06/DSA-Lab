public class Q15_ReverseString {
    public static String reverse(String s, int idx)
    {
        if (idx < 0)
            return "";
        else
            return s.charAt(idx) + reverse(s,--idx);
    }
    public static void main(String[] args) {
        System.out.println("Reverse of abcd is: "+reverse("ABCD",3));
    }
}
