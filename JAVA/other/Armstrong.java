package other;
import java.util.Scanner;

public class Armstrong {
    public static int count(int n) {
        int k=0;
        while(n>0){
            k+=1;
            n=n/10;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int d =count(n);
        int k=0;
        int m=n;
        while(n>0){
            int r =n%10;
            k=k+(int)Math.pow(r, d);
            n=n/10;
        }
        if(m==k){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
        input.close();
    }
}
