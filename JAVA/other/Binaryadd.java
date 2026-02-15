package other;
import java.util.Scanner;


class Binaryadd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3 = n1 + n2;
        int n4=n3;
        System.out.println(n3);
        int k=0;
        int p=1;
        
        while(n3>0){
            int r = n3%2;
            k=r*p+k;
            p=p*10;
            n3=n3/2;
        }
        
        System.out.println(k);
        String result = Integer.toBinaryString(n4);

        System.out.println(result);

        sc.close();
    }
}