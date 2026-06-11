import java.util.*;

class Node
{
    protected int regd_no;
    protected double mark;
    protected Node next;

    Node(int regd_no, double mark)
    {
        this.regd_no = regd_no;
        this.mark = mark;
    }
}

public class LinkedListPractice {
    
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start)
    {
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n;i++)
        {
            System.out.println("Enter details of students");

            System.out.println("Enter the regd number: ");
            int regd = sc.nextInt();
            System.out.println("Enter marks: ");
            double mark = sc.nextDouble();

            Node node = new Node(regd,mark);

            if (start == null)
                start = node;
            else
            {
                Node temp = start;
                while (temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        return start;
    }


    public static void display(Node start)
    {
        if (start == null)
        {
            System.out.println("Underflow");
            return;
        }

        Node temp = start;

        System.out.println("Student Details: ");
        while (temp != null)
        {
            System.out.println("Regd No: "+temp.regd_no+" Marks: "+temp.mark);
            temp = temp.next;
        }
    }

    public static Node InsBeg(Node start)
    {
        System.out.println("Enter regd no: ");
        int regd = sc.nextInt();
        System.out.println("Enter marks: ");
        double mark = sc.nextDouble();

        Node node = new Node(regd,mark);
        node.next = start;
        start = node;

        return start;
    }

    public static Node InsEnd(Node start)
    {
        System.out.println("Enter regd no: ");
        int regd = sc.nextInt();
        System.out.println("Enter marks: ");
        double mark = sc.nextDouble();

        Node node = new Node(regd, mark);
        if (start == null)
        {
            start = node;
            return start;
        }

        Node temp = start;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;

        return start;
    }

    public static Node InsAny(Node start)
    {
        System.out.println("Enter regd no: ");
        int regd = sc.nextInt();
        System.out.println("Enter marks: ");
        double mark = sc.nextDouble();
        System.out.println("Enter position: ");
        int pos = sc.nextInt();

        Node node = new Node(regd,mark);

        if (pos == 1)
        {
            node.next = start;
            start = node;
            return start;
        }

        Node temp = start;

        for (int i = 1;i < pos - 1 && temp != null;i++)
        {
            temp = temp.next;
        }

        
    }
}
