class Deposit
{
    long principal;
    int time;
    double rate, totalAmt;
    Deposit()
    {
        principal = 0;
        time = 0;
        rate = 0.0;
    }
    Deposit(long principal, int time, double rate)
    {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }
    Deposit(long principal, int time)
    {
        this.principal = principal;
        this.time = time;
        this.rate = 7.5;
    }
    Deposit(long principal, double rate)
    {
        this.principal = principal;
        this.time = 1;
        this.rate = rate;
    }

    void display()
    {
        System.out.println("Principal: "+principal+"\tTime: "+time+" years\tRate: "+rate+"%");
    }
    void calc_amt()
    {
        totalAmt = principal + (principal * time * rate) / 100;
    }

}
public class Q4_Deposit {
    public static void main(String args[])
    {
        Deposit d1 = new Deposit(10000, 2 );
        Deposit d2 = new Deposit(15000, 3, 8.5);
        d1.display();
        d1.calc_amt();
        System.out.println("Total Amount: "+d1.totalAmt);
        d2.display();
        d2.calc_amt();
        System.out.println("Total Amount: "+d2.totalAmt);
    }
}
