import java.util.Scanner;

public class CountFrequencey {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }


        for(int i =0;i<n;i++){
            int c=1;
            int k;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    c++;
                    arr[j]=-1;
                }
            }

            if(arr[i]!=-1){
                k=arr[i];
                System.out.println(k+ ":"+ c );

            }

        }
        input.close();
    }
}
