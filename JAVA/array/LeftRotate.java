import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        int j= input.nextInt();
        
        for(int k=1;k<=j;k++){
            int temp = arr[n-1];
            for(int i=n-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0]=temp;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
