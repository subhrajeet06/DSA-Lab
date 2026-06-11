import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class StackDemo2 {

    static Scanner sc = new Scanner(System.in);

    // Push Operation
    public static Node push(Node top) {
        Node newNode = new Node();

        System.out.print("Enter element to push: ");
        newNode.info = sc.nextInt();

        newNode.next = top;
        top = newNode;

        System.out.println("Element inserted successfully.");
        return top;
    }

    // Pop Operation
    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Deleted Element: " + top.info);
            top = top.next;
        }
        return top;
    }

    // Display Operation
    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        Node ptr = top;
        while (ptr != null) {
            System.out.println(ptr.info);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {

        Node top = null;

        while (true) {

            System.out.println("\n**** MENU ****");
            System.out.println("0 : Exit");
            System.out.println("1 : Push");
            System.out.println("2 : Pop");
            System.out.println("3 : Display");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.exit(0);

                case 1:
                    top = push(top);
                    break;

                case 2:
                    top = pop(top);
                    break;

                case 3:
                    display(top);
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}