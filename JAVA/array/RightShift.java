import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int j= input.nextInt();
        for(int k=1;k<=j;k++){
            int temp = arr[0];
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1]=temp;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
