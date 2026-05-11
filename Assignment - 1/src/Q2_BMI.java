import java.util.*;
public class Q2_BMI
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double wt = sc.nextDouble();
        System.out.print("Enter height in m: ");
        double ht = sc.nextDouble();
        double bmi = wt/(ht*ht);
        if (bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25)
        {
            System.out.println("Normal weight");
        }
        else if (bmi >= 25 && bmi < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
        sc.close();
    }
}