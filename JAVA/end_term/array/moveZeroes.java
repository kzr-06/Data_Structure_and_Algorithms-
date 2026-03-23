import java.util.Scanner;

public class moveZeroes {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

            // ========================= Bubble Sort ================================================
        // int c=0;
        // for(int i=0;i<n-c;i++){
        //     if(arr[i]==0){
        //         for (int k = i; k < n - 1 - c; k++) {
        //             int temp = arr[k];
        //             arr[k] = arr[k + 1];
        //             arr[k + 1] = temp;
        //         }

        //         i--;
        //         c++;
        //     }
        // }

        // ===================== 2-Pointer Approach =========================================
        for(int i=0,j=0;i<n;i++){
            if(arr[i]!=0){
                int  temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


        input.close();
    }
}


