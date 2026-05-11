import java.util.*;
public class Q8_MatrixArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of Matrix: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements of the Matrix: ");
        int sum = 0;
        for (int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("Matrix is: ");
        for (int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of all elements in the matrix is: " + sum);
        sc.close();
    }
}
