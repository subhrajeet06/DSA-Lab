import java.util.*;
public class Q9_MaxtrixSumDiagonal {
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum = 0;
        for (int i = 0;i < m.length;i++)
        {
            for (int j = 0;j < m[i].length;j++)
            {
                if (i == j)
                    sum += m[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 by 4 matrix row by row");
        double m[][] = new double[4][4];
        for (int i = 0;i < m.length;i++)
        {
            for(int j = 0;j < m[i].length;j++)
            {
                m[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
        sc.close();
    }
}
