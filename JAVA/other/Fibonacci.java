package other;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=0; i<n-2; i++){
            int temp =a+b;
            a=b;
            b=temp;
            System.out.print(temp+" ");
        }
        input.close();
    }
    
}
