package other;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        boolean isprime =true;

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime= false;
                break;
            }
        }
          
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        input.close();
    }
}
