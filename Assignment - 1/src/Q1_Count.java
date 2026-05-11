public class Q1_Count {
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        if (n <= 2)
        {
            System.out.println("Number should be greater than 2");
            return;
        }
        int c = 0, temp = n;
        while (temp > 2)
        {
            temp /= 2;
            c++;
        }
        System.out.println("Positive integer greater than 2 is: " + n);
        System.out.println("Number of repititions: "+c);
    }    
}
