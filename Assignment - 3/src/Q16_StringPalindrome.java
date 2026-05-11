public class Q16_StringPalindrome {
    public static boolean isPalindrome(String s, int l, int u)
    {
        if (l > u)
            return true;
        if (s.charAt(l) != s.charAt(u))
            return false;
        else
            return isPalindrome(s,++l,--u);
    }
    public static void main(String[] args) {
        System.out.println("MADAM: "+isPalindrome("madam", 0, 4));
        System.out.println("ABCD: "+isPalindrome("abcd", 0, 3));
    }
}
