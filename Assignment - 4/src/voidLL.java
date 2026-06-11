import java.util.Scanner;

class Node {
    int regd_no;
    float mark;
    Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
    }
}

public class voidLL {

    static Scanner sc = new Scanner(System.in);
    static Node start = null;

    // Create
    public static void create() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {

            System.out.print("Enter Registration Number: ");
            int regd = sc.nextInt();

            System.out.print("Enter Mark: ");
            float mark = sc.nextFloat();

            Node newNode = new Node(regd, mark);

            if(start == null)
                start = newNode;
            else {
                Node temp = start;

                while(temp.next != null)
                    temp = temp.next;

                temp.next = newNode;
            }
        }
    }

    // Display
    public static void display() {

        if(start == null) {
            System.out.println("List Empty");
            return;
        }

        Node temp = start;

        System.out.println("\nRegd No\tMark");

        while(temp != null) {
            System.out.println(temp.regd_no + "\t" + temp.mark);
            temp = temp.next;
        }
    }

    // Insert Beginning
    public static void InsBeg() {

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        newNode.next = start;
        start = newNode;
    }

    // Insert End
    public static void InsEnd() {

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if(start == null) {
            start = newNode;
            return;
        }

        Node temp = start;

        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Insert Any Position
    public static void InsAny() {

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if(pos == 1) {
            newNode.next = start;
            start = newNode;
            return;
        }

        Node temp = start;

        for(int i=1;i<pos-1 && temp!=null;i++)
            temp = temp.next;

        if(temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete Beginning
    public static void DelBeg() {

        if(start == null) {
            System.out.println("List Empty");
            return;
        }

        start = start.next;
    }

    // Delete End
    public static void DelEnd() {

        if(start == null) {
            System.out.println("List Empty");
            return;
        }

        if(start.next == null) {
            start = null;
            return;
        }

        Node temp = start;

        while(temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    // Delete Any Position
    public static void DelAny() {

        if(start == null) {
            System.out.println("List Empty");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if(pos == 1) {
            start = start.next;
            return;
        }

        Node temp = start;

        for(int i=1;i<pos-1 && temp.next!=null;i++)
            temp = temp.next;

        if(temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // Delete By Registration Number
    public static void deleteByRegd() {

        if(start == null) {
            System.out.println("List Empty");
            return;
        }

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        if(start.regd_no == regd) {
            start = start.next;
            System.out.println("Deleted");
            return;
        }

        Node temp = start;

        while(temp.next != null &&
              temp.next.regd_no != regd)
            temp = temp.next;

        if(temp.next == null)
            System.out.println("Student Not Found");
        else {
            temp.next = temp.next.next;
            System.out.println("Deleted");
        }
    }

    // Search and Update
    public static void search() {

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        Node temp = start;

        while(temp != null) {

            if(temp.regd_no == regd) {

                System.out.println("Student Found");
                System.out.println("Current Mark = "
                                    + temp.mark);

                System.out.print("Enter New Mark: ");
                temp.mark = sc.nextFloat();

                System.out.println("Updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student Not Found");
    }

    // Sort Descending
    public static void sort() {

        Node i, j;

        for(i=start;i!=null;i=i.next) {

            for(j=i.next;j!=null;j=j.next) {

                if(i.mark < j.mark) {

                    float tMark = i.mark;
                    i.mark = j.mark;
                    j.mark = tMark;

                    int tReg = i.regd_no;
                    i.regd_no = j.regd_no;
                    j.regd_no = tReg;
                }
            }
        }

        System.out.println("Sorted Successfully");
    }

    // Count
    public static void count() {

        int c = 0;

        Node temp = start;

        while(temp != null) {
            c++;
            temp = temp.next;
        }

        System.out.println("Total Nodes = " + c);
    }

    // Reverse
    public static void reverse() {

        Node prev = null;
        Node curr = start;
        Node next;

        while(curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        start = prev;

        System.out.println("List Reversed");
    }

    public static void main(String[] args) {

        int choice;

        while(true) {

            System.out.println("\n***** MENU *****");
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert Beginning");
            System.out.println("4. Insert End");
            System.out.println("5. Insert Any Position");
            System.out.println("6. Delete Beginning");
            System.out.println("7. Delete End");
            System.out.println("8. Delete Any Position");
            System.out.println("9. Delete By Regd No");
            System.out.println("10. Search & Update");
            System.out.println("11. Sort");
            System.out.println("12. Count");
            System.out.println("13. Reverse");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 0: System.exit(0);
                case 1: create(); break;
                case 2: display(); break;
                case 3: InsBeg(); break;
                case 4: InsEnd(); break;
                case 5: InsAny(); break;
                case 6: DelBeg(); break;
                case 7: DelEnd(); break;
                case 8: DelAny(); break;
                case 9: deleteByRegd(); break;
                case 10: search(); break;
                case 11: sort(); break;
                case 12: count(); break;
                case 13: reverse(); break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}