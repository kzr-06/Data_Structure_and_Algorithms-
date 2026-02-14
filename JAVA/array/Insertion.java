
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pos = input.nextInt();
        int ele = input.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n + 1];

        
        
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // arr1 = arr.clone();
        // System.arraycopy(arr, 0, arr1, 0, arr1.length);
    
        for (int i = 0; i < n ; i++) {
            arr1[i] = arr[i];
        }
        
        for (int i = n; i >= pos; i--) {
            if (i > pos) {
                arr1[i] = arr1[i - 1];
            } else if (i == pos) {
                arr1[i] = ele;
                break;
            }

        }
        for (int i = 0; i <=n ; i++) {
            System.out.print(arr1[i] + " ");
        }

        input.close();
    }
}
