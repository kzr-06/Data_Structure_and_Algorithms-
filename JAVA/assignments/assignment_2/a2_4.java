
import java.util.Scanner;
class Mathoperations{
     public int add(int a,int b){
        return a+b;

     }
     public double add (double a,double b){
        return a+b;
     }
}

public class a2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double c = input.nextDouble();
        double d = input.nextDouble();

        Mathoperations add1 = new Mathoperations();
        System.out.println(add1.add(a, b));
        System.out.println(add1.add(c, d));

        input.close();
    }
}
