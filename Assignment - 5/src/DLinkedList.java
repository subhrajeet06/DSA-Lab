import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
        prev = null;
    }
}

public class DLinkedList {

    static Scanner sc = new Scanner(System.in);

    // Create Doubly Linked List
    public static Node create(Node start, Node end) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Registration Number: ");
            int regd_no = sc.nextInt();

            System.out.print("Enter Mark: ");
            float mark = sc.nextFloat();

            Node newNode = new Node(regd_no, mark);

            if (start == null) {
                start = end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }
        }

        return end;
    }

    // Display List
    public static void display(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = start;

        System.out.println("\nDoubly Linked List:");
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no +
                               "  Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    // Insert at Beginning
    public static Node insBeg(Node start, Node end) {

        System.out.print("Enter Registration Number: ");
        int regd_no = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if (start == null) {
            start = end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }

        return start;
    }

    // Insert at End
    public static Node insEnd(Node start, Node end) {

        System.out.print("Enter Registration Number: ");
        int regd_no = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if (start == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }

        return end;
    }

    // Insert at Any Position
    public static Node insAny(Node start, Node end) {

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter Registration Number: ");
        int regd_no = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if (pos == 1) {
            newNode.next = start;

            if (start != null)
                start.prev = newNode;

            start = newNode;

            return start;
        }

        Node temp = start;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return start;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;

        return start;
    }

    // Delete from Beginning
    public static Node delBeg(Node start, Node end) {

        if (start == null) {
            System.out.println("List is empty");
            return start;
        }

        start = start.next;

        if (start != null)
            start.prev = null;

        System.out.println("First node deleted");

        return start;
    }

    // Delete from End
    public static Node delEnd(Node start, Node end) {

        if (start == null) {
            System.out.println("List is empty");
            return end;
        }

        if (start.next == null) {
            start = end = null;
            return end;
        }

        end = end.prev;
        end.next = null;

        System.out.println("Last node deleted");

        return end;
    }

    // Delete from Any Position
    public static Node delAny(Node start, Node end) {

        if (start == null) {
            System.out.println("List is empty");
            return start;
        }

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            start = start.next;

            if (start != null)
                start.prev = null;

            return start;
        }

        Node temp = start;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return start;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        System.out.println("Node deleted");

        return start;
    }

    // Search and Update
    public static void search(Node start) {

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Enter Registration Number to search: ");
        int key = sc.nextInt();

        Node temp = start;

        while (temp != null) {

            if (temp.regd_no == key) {

                System.out.println("Student Found");
                System.out.println("Current Mark: " + temp.mark);

                System.out.print("Enter New Mark: ");
                temp.mark = sc.nextFloat();

                System.out.println("Mark Updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Main Method
    public static void main(String[] args) {

        Node start = null;
        Node end = null;

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert at Beginning");
            System.out.println("4. Insert at End");
            System.out.println("5. Insert at Any Position");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Any Position");
            System.out.println("9. Search and Update");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.exit(0);

                case 1:
                    end = create(start, end);

                    if (start == null)
                        start = end;

                    break;

                case 2:
                    display(start, end);
                    break;

                case 3:
                    start = insBeg(start, end);

                    if (end == null)
                        end = start;

                    break;

                case 4:
                    end = insEnd(start, end);

                    if (start == null)
                        start = end;

                    break;

                case 5:
                    start = insAny(start, end);
                    break;

                case 6:
                    start = delBeg(start, end);
                    break;

                case 7:
                    end = delEnd(start, end);
                    break;

                case 8:
                    start = delAny(start, end);
                    break;

                case 9:
                    search(start);
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}