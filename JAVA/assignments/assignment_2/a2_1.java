import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    
}
public class a2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String title = input.next();
        String author = input.next();
        double price = input.nextDouble();

        Book book = new Book(title,author,price);

        book.displayDetails();

        input.close();
    }
    
}
