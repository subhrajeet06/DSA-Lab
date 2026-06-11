import java.util.*;

class Node
{
    int info;
    Node next;
}


public class StackLinkedList {
    
    static Scanner sc = new Scanner(System.in);

    public static Node push(Node top)
    {
        Node node = new Node();

        System.out.println("Enter elements to push: ");
        node.info = sc.nextInt();

        node.next = top;
        top = node;

        System.out.println("Element inserted successfully");
        return top;
    }

    public static Node pop(Node top)
    {
        if (top == null)
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Deleted element: "+top.info);
            top = top.next;
        }
        return top;
    }

    public static void display(Node top)
    {
        if (top == null)
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack Elements: ");
            
            Node pointer = top;
            while (pointer != null)
            {
                System.out.println(pointer.info);
                pointer = pointer.next;
            }
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
