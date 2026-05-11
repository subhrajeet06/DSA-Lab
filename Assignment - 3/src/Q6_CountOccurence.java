public class Q6_CountOccurence {
    public static <T> int count(T[] array, T item)
    {
        int c = 0;
        for (T i : array)
        {
            if (i.equals(item))
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Integer intArr[] = {1,2,5,3,2,4,2,2,6,8,5,2};
        String stringArr[] = {"apple", "banana", "cat", "apple","elephant"};
        System.out.println("Count of 2: "+count(intArr,2));
        System.out.println("Count of apple: "+count(stringArr, "apple"));
    }
}
