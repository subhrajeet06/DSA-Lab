import java.util.*;
public class Q10_MatrixSumColumn {
    public static double sumColumn(double m[][], int columnIndex)
    {
        double sum = 0;
        for (int i = 0;i < m.length;i++)
        {
            for (int j = 0;j < m[i].length;j++)
            {
                if (j == columnIndex)
                    sum += m[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 by 4 matrix row by row: ");
        double m[][] = new double[3][4];
        for (int i = 0;i < m.length;i++)
        {
            for (int j = 0;j < m[i].length;j++)
            {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0;j < m[0].length;j++)
        {
            System.out.println("The sum of elements at column "+j+" is "+sumColumn(m,j));
        }
        sc.close();
    }
}
