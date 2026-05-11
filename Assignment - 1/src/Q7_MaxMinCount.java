import java.util.*;
public class Q7_MaxMinCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int maxCount = 0;
        int minCount = 0;
        int firstMaxPos = -1;
        int lastMinPos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                if (firstMaxPos == -1) {
                    firstMaxPos = i;
                }
                maxCount++;
            }
            if (arr[i] == min) {
                lastMinPos = i;
                minCount++;
            }
        }
        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + (firstMaxPos + 1) + ".");
        System.out.println("Last occurrence of minimum element is at position " + (lastMinPos + 1) + ".");
        sc.close();
    }
}
