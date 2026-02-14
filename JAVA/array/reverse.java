import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int j=(Integer)(n/2);
        for(int i=0,y=n-1; i<j;i++,y--){
            int temp = arr[y];
            arr[y] = arr[i];
            arr[i] = temp;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
