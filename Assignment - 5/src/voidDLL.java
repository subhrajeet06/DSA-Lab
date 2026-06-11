import java.util.Scanner;

class Node {
    int regd_no;
    float mark;
    Node next;
    Node prev;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
        prev = null;
    }
}

public class voidDLL {

    static Scanner sc = new Scanner(System.in);
    static Node start = null;
    static Node end = null;

    // Create List
    public static void create() {

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
    }

    // Display
    public static void display() {

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = start;

        System.out.println("\nStudent Records:");

        while (temp != null) {
            System.out.println("Regd No = " + temp.regd_no +
                               "  Mark = " + temp.mark);
            temp = temp.next;
        }
    }

    // Insert at Beginning
    public static void insBeg() {

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

        System.out.println("Node inserted at beginning");
    }

    // Insert at End
    public static void insEnd() {

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

        System.out.println("Node inserted at end");
    }

    // Insert at Any Position
    public static void insAny() {

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            insBeg();
            return;
        }

        System.out.print("Enter Registration Number: ");
        int regd_no = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        Node temp = start;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;
        else
            end = newNode;

        temp.next = newNode;

        System.out.println("Node inserted");
    }

    // Delete from Beginning
    public static void delBeg() {

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (start == end) {
            start = end = null;
        } else {
            start = start.next;
            start.prev = null;
        }

        System.out.println("First node deleted");
    }

    // Delete from End
    public static void delEnd() {

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (start == end) {
            start = end = null;
        } else {
            end = end.prev;
            end.next = null;
        }

        System.out.println("Last node deleted");
    }

    // Delete from Any Position
    public static void delAny() {

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            delBeg();
            return;
        }

        Node temp = start;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        if (temp == end) {
            delEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        System.out.println("Node deleted");
    }

    // Search and Update Mark
    public static void search() {

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Enter Registration Number: ");
        int key = sc.nextInt();

        Node temp = start;

        while (temp != null) {

            if (temp.regd_no == key) {

                System.out.println("Student Found");
                System.out.println("Current Mark = " + temp.mark);

                System.out.print("Enter New Mark: ");
                temp.mark = sc.nextFloat();

                System.out.println("Mark Updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student Not Found");
    }

    public static void main(String[] args) {

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

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.exit(0);

                case 1:
                    create();
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    insBeg();
                    break;

                case 4:
                    insEnd();
                    break;

                case 5:
                    insAny();
                    break;

                case 6:
                    delBeg();
                    break;

                case 7:
                    delEnd();
                    break;

                case 8:
                    delAny();
                    break;

                case 9:
                    search();
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}