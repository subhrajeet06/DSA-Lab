import java.util.*;
class Car_Details
{
	String model;
	int year;
	void setDetails(String a, int b)
	{
		model = a;
		year = b;
	}

	void displayDetails()
	{
		System.out.println("The model of the car is "+model+" and year is "+year);
	}
	
}

public class Q1_Car
{
	public static void main(String args[])
	{
		Car_Details c1 = new Car_Details();
		Car_Details c2 = new Car_Details();
		c1.model = "TOYOTA";
		c1.year = 2020;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model and year of the second car:");
		String model = sc.nextLine();
		int year = sc.nextInt();
		c2.setDetails(model, year);
		c1.displayDetails();
		c2.displayDetails();
		if (c1.year > c2.year)
			System.out.println("The newer car is: "+c1.model);
		else if (c1.year < c2.year)
			System.out.println("The newer car is: "+c2.model);
		else
			System.out.println("Both cars are of the same year.");
		sc.close();
	}
}