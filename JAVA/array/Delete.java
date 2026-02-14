import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pos = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(i==pos || i>pos){
                arr[i]=arr[i+1];
            }
                
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }

    
        input.close();
    }
}
