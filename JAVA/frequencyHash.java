package JAVA;
import java.util.Scanner;

public class frequencyHash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        String str="";

        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && !(str.contains(String.valueOf(arr[i])))) {
                    count++;
                }
            }
            if(count !=0){
                System.out.println(arr[i] + " : " + count);
                str+=String.valueOf(arr[i]);
            }
        }


        // for(int i=0;i<arr1.length;i++){
        //     sum1+=arr1[i];
        // }
        // for(int i=0;i<arr2.length;i++){
        //     sum2+=arr2[i];
        // }
        // System.out.println(Math.abs(sum1-sum2));

        input.close();
    }
}


