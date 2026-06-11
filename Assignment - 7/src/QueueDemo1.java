import java.util.Scanner;

public class QueueDemo1 {

    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    static Scanner sc = new Scanner(System.in);

    // Check whether queue is full
    public static boolean is_full() {
        return (rear == MAX - 1);
    }

    // Check whether queue is empty
    public static boolean is_empty() {
        return (front == -1 || front > rear);
    }

    // Insert element
    public static void insert(int Q[]) {
        if (is_full()) {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();

        if (front == -1)
            front = 0;

        rear++;
        Q[rear] = x;

        System.out.println(x + " inserted successfully.");
    }

    // Delete element
    public static void delete(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted element: " + Q[front]);

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    // Display queue
    public static void display(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(Q[i] + " ");
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