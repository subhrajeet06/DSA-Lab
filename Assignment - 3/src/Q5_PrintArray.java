public class Q5_PrintArray {
    public static <E> void printArray(E[] inputArray)
    {
        for (E i: inputArray)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }    
    public static void main(String[] args) {
        Integer intArr[] = {1,2,3,4};
        Double doubleArr[] = {1.1,2.2,3.3,4.4};
        Character charArr[] = {'A','B','C','D'};
        printArray(intArr);
        printArray(doubleArr);
        printArray(charArr);
    }
}
