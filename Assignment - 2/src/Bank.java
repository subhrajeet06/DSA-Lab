class Bank_Details
{
	String name;
	long acno;
	double balance;
	
	void input(String a,long b,double c)
	{
		name = a;
		acno = b;
		balance = c;
	}
	void display()
	{
		System.out.println("Customer name: "+name+"\nAccount Number: "+acno+"\nBalance: "+balance);
	}
	void deposit(double x)
	{
		balance += x;
	}
	void withdraw(double amt)
	{
		if (amt > balance)
			System.out.println("Insufficient Balance\nCurrent Balance Amount: "+balance);
		else
		{
			System.out.println("Withdraw successful");
			balance -= amt;
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Details c1 = new Bank_Details();
		Bank_Details c2 = new Bank_Details();
		c1.input("Rahul", 251186451, 25423646.92);
		c2.input("SinU.CosU",456374535,45353473.54);
		c1.deposit(25000);
		c2.deposit(12000);
		c1.withdraw(324515458);
		c2.withdraw(1545243);
		c1.display();
		c2.display();
	}

}
