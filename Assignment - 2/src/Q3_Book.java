class Book
{
    int book_id;
    double price;
    int quantity;
    static double totalAmount;
    Book (int book_id, double price, int quantity)
    {
        this.book_id = book_id;
        this.price = price;
        this.quantity = quantity;
        totalAmount += calculateTotalAmount();
    }

    void displayDetails()
    {
        System.out.println(book_id+"\t"+price+"\t"+quantity+"\t\t"+calculateTotalAmount());
    }

    double calculateTotalAmount()
    {
        return price * quantity;
    }
}

public class Q3_Book {
    public static void main(String args[])
    {
        Book b1 = new Book(54214,360,2);
        Book b2 = new Book(54215,250,3);
        Book b3 = new Book(54216,150,4);
        Book b4 = new Book(54217,500,1);
        Book b5 = new Book(54218,200,5);
        System.out.println("Book Details:\n-----------------");
        System.out.println("Book ID\tPrice\tQuantity\tTotal Cost");
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();
        System.out.println("Total Amount: "+Book.totalAmount);
    }
}
