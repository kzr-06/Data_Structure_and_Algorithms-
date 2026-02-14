import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c==1){
                System.out.println(arr[i]);
            }
        }

        input.close();
    }
}
