package other;
import java.util.Scanner;

public class prime_range {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    for(int i=1; i<=n; i++){
        boolean isprime = true;
        for (int j=2;j*j<=i;j++){
            if(i%j==0){
               isprime = false; 
               break;
            }
        }
        if(isprime){
            System.out.println(i+"  Prime");
        }
        else{
            System.out.println(i+"  Not Prime");
        }
    
    }

    input.close();
 }   
}
