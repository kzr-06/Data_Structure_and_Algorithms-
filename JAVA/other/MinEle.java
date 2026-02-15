package other;

import java.util.Scanner;

public class MinEle {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextDouble();
        }
        double max = Integer.MAX_VALUE;
        for(double i:arr){
            if(i>max){
                max = i;
            }
        }
        if(max!=0){

            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    
                    arr[i]=arr[i]/max;
                }
                
            }
            System.out.println(max);
            for(double i:arr){
                System.out.printf("%.1f ", i );
            }
        }
        else{
            System.out.println(max+" is 0");
        }
        input.close();
    }
}
