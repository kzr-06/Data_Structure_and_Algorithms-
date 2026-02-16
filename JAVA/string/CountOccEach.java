package string;

import java.util.Scanner;

public class CountOccEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        int[] arr = new int[255];
        

        for(int i=0;i<n.length();i++){
            arr[(int)n.charAt(i)]++;
        }

        int[] arr2 = new int[255];
  
        for(int i=0;i<n.length();i++){
            int j=(int)n.charAt(i);
            if(arr2[j]==0 && j!=32){
                arr2[j] = 1;
                System.out.println(n.charAt(i)+" : "+arr[j]);
            }
            
        }

        
        input.close();
    }
}

/* =========================================== Frequency =======================================================
 Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        int[] arr = new int[26];
        n=n.replace(" ","");
        

        for(int i=0;i<n.length();i++){
            arr[(int)n.charAt(i)-97]++;
        }


 */