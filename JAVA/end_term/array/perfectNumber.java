import java.util.Scanner;

public class perfectNumber {
        static int PerfectNumber(int n){
        if(n==0){
            return 0;
        }
        int s=0;
        for(int i=1; i<=(int)n/2 ;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            int k =PerfectNumber(arr[i]);
            if(k>0 && k==arr[i]){
                s++;
            }

        }
        System.out.println(s);
        



        input.close();
    }
}

