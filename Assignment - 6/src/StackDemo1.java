import java.util.Scanner;

public class StackDemo1 {

    public static final int MAX = 10;
    static Scanner sc = new Scanner(System.in);

    // Push operation
    public static int push(int S[], int top) {
        if (top == MAX - 1)
            System.out.println("Stack overflow");
        // if (isFull(top)) {
        //     System.out.println("Stack Overflow");
        //} 
        else {
            System.out.print("Enter element to push: ");
            int x = sc.nextInt();
            top++;
            S[top] = x;
            System.out.println(x + " pushed into stack.");
        }
        return top;
    }

    // Pop operation
    public static int pop(int S[], int top) {
        if (top == -1)
            System.out.println("Stack underflow");
        // if (isEmpty(top)) {
        //     System.out.println("Stack Underflow");
        //} 
        else {
            System.out.println("Deleted Element: " + S[top]);
            top--;
        }
        return top;
    }

    // Display operation
    public static void display(int S[], int top) {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(S[i]);
            }
        }
    }

    // Check empty
    public static boolean isEmpty(int top) {
        return (top == -1);
    }

    // Check full
    public static boolean isFull(int top) {
        return (top == MAX - 1);
    }

    public static void main(String[] args) {

        int stack[] = new int[MAX];
        int top = -1;

        while (true) {

            System.out.println("\n*** MENU ***");
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
                    top = push(stack, top);
                    break;

                case 2:
                    top = pop(stack, top);
                    break;

                case 3:
                    display(stack, top);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}