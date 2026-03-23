import java.util.Scanner;

public class intersectionOfArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        
        for(int i=0;i<n1;i++){
            arr1[i]=input.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=input.nextInt();
        }


        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n2;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        
        int n = n1>n2?n2:n1;
        int[] arr = new int[n];
        int c=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    arr[c++]=arr1[i];
                }
            }
        }

        for(int i=0;i<c;i++){
            for(int j=i+1;j<c;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n;k++){
                        arr[j]=arr[k];
                    }
                }
            }
        }





        for(int i=0;i<c;i++){
            if(arr[i]!=0) System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
