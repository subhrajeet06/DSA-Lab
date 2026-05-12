import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class LinkedList {

    static Scanner sc = new Scanner(System.in);

    // Create List
    public static Node create(Node start) {
        int n;
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of student " + i);

            System.out.print("Enter Registration Number: ");
            int regd = sc.nextInt();

            System.out.print("Enter Mark: ");
            float mark = sc.nextFloat();

            Node newNode = new Node(regd, mark);

            if (start == null) {
                start = newNode;
            } else {
                Node temp = start;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        return start;
    }

    // Display List
    public static void display(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = start;

        System.out.println("\nStudent Details:");
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no +
                    "  Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    // Insert at Beginning
    public static Node InsBeg(Node start) {
        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        newNode.next = start;
        start = newNode;

        return start;
    }

    // Insert at End
    public static Node InsEnd(Node start) {

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if (start == null) {
            start = newNode;
            return start;
        }

        Node temp = start;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return start;
    }

    // Insert at Any Position
    public static Node InsAny(Node start) {

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if (pos == 1) {
            newNode.next = start;
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
        temp.next = newNode;

        return start;
    }

    // Delete from Beginning
    public static Node DelBeg(Node start) {

        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }

        start = start.next;

        return start;
    }

    // Delete from End
    public static Node DelEnd(Node start) {

        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }

        if (start.next == null) {
            start = null;
            return start;
        }

        Node temp = start;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return start;
    }

    // Delete from Any Position
    public static Node DelAny(Node start) {

        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            start = start.next;
            return start;
        }

        Node temp = start;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Position");
            return start;
        }

        temp.next = temp.next.next;

        return start;
    }

    // Delete by Registration Number
    public static Node deleteByRegd(Node start) {

        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }

        System.out.print("Enter Registration Number to delete: ");
        int regd = sc.nextInt();

        if (start.regd_no == regd) {
            start = start.next;
            System.out.println("Node Deleted.");
            return start;
        }

        Node temp = start;

        while (temp.next != null && temp.next.regd_no != regd) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Node Deleted.");
        }

        return start;
    }

    // Search and Update
    public static void search(Node start) {

        if (start == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Enter Registration Number to search: ");
        int regd = sc.nextInt();

        Node temp = start;

        while (temp != null) {

            if (temp.regd_no == regd) {

                System.out.println("Student Found.");
                System.out.println("Current Mark: " + temp.mark);

                System.out.print("Enter New Mark: ");
                temp.mark = sc.nextFloat();

                System.out.println("Mark Updated.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found.");
    }

    // Sort List Descending
    public static void sort(Node start) {

        if (start == null) {
            return;
        }

        Node i, j;

        for (i = start; i != null; i = i.next) {

            for (j = i.next; j != null; j = j.next) {

                if (i.mark < j.mark) {

                    float tempMark = i.mark;
                    i.mark = j.mark;
                    j.mark = tempMark;

                    int tempRegd = i.regd_no;
                    i.regd_no = j.regd_no;
                    j.regd_no = tempRegd;
                }
            }
        }

        System.out.println("List Sorted Successfully.");
    }

    // Count Nodes
    public static int count(Node start) {

        int count = 0;

        Node temp = start;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Reverse List
    public static Node reverse(Node start) {

        Node prev = null;
        Node current = start;
        Node next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        start = prev;

        return start;
    }

    // Main Method
    public static void main(String[] args) {

        Node start = null;

        int choice;

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
            System.out.println("9. Delete by Registration Number");
            System.out.println("10. Search and Update");
            System.out.println("11. Sort");
            System.out.println("12. Count Nodes");
            System.out.println("13. Reverse List");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.exit(0);

                case 1:
                    start = create(start);
                    break;

                case 2:
                    display(start);
                    break;

                case 3:
                    start = InsBeg(start);
                    break;

                case 4:
                    start = InsEnd(start);
                    break;

                case 5:
                    start = InsAny(start);
                    break;

                case 6:
                    start = DelBeg(start);
                    break;

                case 7:
                    start = DelEnd(start);
                    break;

                case 8:
                    start = DelAny(start);
                    break;

                case 9:
                    start = deleteByRegd(start);
                    break;

                case 10:
                    search(start);
                    break;

                case 11:
                    sort(start);
                    break;

                case 12:
                    System.out.println("Total Nodes = " + count(start));
                    break;

                case 13:
                    start = reverse(start);
                    System.out.println("List Reversed.");
                    break;

                default:
                    System.out.println("Wrong Choice.");
            }
        }
    }
}