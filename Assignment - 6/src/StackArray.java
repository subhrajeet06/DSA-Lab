import java.util.*;
public class StackArray {
    
    public static final int MAX = 10;
    static Scanner sc = new Scanner(System.in);

    public static int push(int S[], int top)
    {
        if (top == MAX - 1)
            System.out.println("Stack overflow");
        else
        {
            System.out.println("Enter a number to push: ");
            int n = sc.nextInt();
            top++;
            S[top] = n;
            System.out.println(n+" pushed into the stack");
        }
        return top;
    }

    public static int pop(int S[], int top)
    {
        if (top == -1)
            System.out.println("Stack underflow");
        else
        {
            System.out.println("Deleted element: "+S[top]);
            top--;
        }
        return top;
    }

    public static void display(int S[], int top)
    {
        if (top == -1)
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack elements: ");
            for (int i = top;i >= 0;i--)
            {
                System.out.print(S[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int stack[] = new int[MAX];
        int top = -1;

        while(true)
        {
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");

            int ch = sc.nextInt();

            switch (ch) {
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
