class Employee
{
    String name;
    double salary;
    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    void displayEmployeeInfo()
    {
        System.out.println("Employee Name: "+name+"\nSalary: "+salary);
    }
}

class Manager extends Employee
{
    String department;
    Manager(String name, double salary, String department)
    {
        super(name, salary);
        this.department = department;
    }
    void displayManagerDetails()
    {
        displayEmployeeInfo();
        System.out.println("Department: "+department);
    }
}
public class Q9_Employee {
    public static void main(String args[])
    {
        Manager m = new Manager("Subhrajeet", 1200000, "Team Lead");
        m.displayManagerDetails();
    }
}
