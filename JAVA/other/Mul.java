package other;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int m=1;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            m=m*arr[i];
        }
        
        for(int i=0;i<n;i++){
            arr[i] = m/arr[i];
        }
        
        for(int i:arr){
            System.out.print(i+" ");
        }
        input.close();
}
}