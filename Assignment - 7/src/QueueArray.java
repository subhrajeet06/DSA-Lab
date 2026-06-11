import java.util.*;

public class QueueArray {
    public static final int MAX = 5;
    public static int rear = -1;
    public static int front = -1;
    static Scanner sc = new Scanner(System.in);

    public static void insert(int Q[])
    {
        if (rear == MAX - 1)
        {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.println("Enter element to insert: ");
        int n = sc.nextInt();

        if (front == -1)
            front = 0;
        rear++;
        Q[rear] = n;
        System.out.println(n+" inserted successfully");
    }

    public static void delete(int Q[])
    {
        if (front == -1 || front > rear)
        {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Deleted element: "+Q[front]);
        front++;
        if (front > rear)
        {
            rear = -1;
            front = -1;
        }
    }

    public static void display(int Q[])
    {
        if (front == -1 || front > rear)
        {
            System.out.println("Empty queue");
            return;
        }

        System.out.println("Queue elements: ");
        for (int i = front;i < rear;i++)
        {
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int queue[] = new int[MAX];

        while (true) {

            System.out.println("\n*** MENU ***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Program Terminated");
                    System.exit(0);

                case 1:
                    insert(queue);
                    break;

                case 2:
                    delete(queue);
                    break;

                case 3:
                    display(queue);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
