package other;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }

        for(int i=0;i<n;i++){
            arr[i]=arr[i]*max;
        }
        System.out.println(max);
        for(int i:arr){
            System.out.print(i+" ");
        }
        input.close();
    }
}
