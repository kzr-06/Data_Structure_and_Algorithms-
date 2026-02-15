package other;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int m = n;
        int k=0;
        while(n>0){
            int r =n%10;
            k=(10*k)+r;
            n=n/10;
        }
        if(m==k){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        input.close();
    }
    
}
