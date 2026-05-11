class HealthConditionException extends Exception
{
	HealthConditionException(String s)
	{
		super(s);
	}
}

class Person
{
	private String name;
	private double wt, ht;
	Person(String name, double ht, double wt)
	{
		this.name = name;
		this.ht = ht;
		this.wt = wt;
	}
	void calculate() throws HealthConditionException
	{
		double bmi = wt/(ht*ht);
		if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Normal");
		else
			throw new HealthConditionException("Abnormal");
	}
	void display()
	{
		System.out.println("Name: "+name+"\nHeight: "+ht+"\nWeight: "+wt);
	}
}
public class PersonBMI {
	public static void main(String args[])
	{
		Person p = new Person("ABCD",173.3,68.5);
		p.display();
		try
		{
			p.calculate();
		}
		catch (HealthConditionException h)
		{
			System.out.println(h);
		}
	}
}
