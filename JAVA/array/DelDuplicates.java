import java.util.Scanner;

public class DelDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int c = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(arr[j] == arr[i]){
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
                
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    
        input.close();
    }
}
