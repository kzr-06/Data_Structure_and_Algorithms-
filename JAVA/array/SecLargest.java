import java.util.Scanner;

public class SecLargest {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        int max =  Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i:arr){
            if(i>max){
                smax=max;
                max = i;
            }
            else if(i>smax && i<max){
                smax=i;
            }
        }
        System.out.println(smax);
        input.close();
    }
}
