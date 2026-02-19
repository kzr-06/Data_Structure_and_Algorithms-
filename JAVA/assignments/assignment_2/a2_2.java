import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;

    public Rectangle() {
        length = 1;     
        breadth = 1;    
        System.out.println("Area: " + (length * breadth));

    }
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Area: "+length*breadth);
    }

    
}
public class a2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // double length = input.nextDouble();
        // double breadth = input.nextDouble();

        // Rectangle rect = new Rectangle();
        // Rectangle rect1 = new Rectangle(length,breadth);

        input.close();
    }
}
