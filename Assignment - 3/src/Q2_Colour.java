//import java.util.*;;
public class Q2_Colour {
    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);
        String arr[] = {"Blue","Black","Red","Green","Yellow"};
        try
        {
            System.out.println("Color: "+arr[2]);
            System.out.println("Color: "+arr[3]);
            System.out.println("Color: "+arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");
        }

        String arr1[] = null;
        try
        {
            System.out.println("Color: "+arr1[0]);
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }
    }
}