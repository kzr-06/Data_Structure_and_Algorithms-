package other;
import java.util.Scanner;

public class Digit_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int l =(int)Math.log10(input1)+1;
        System.out.println(l);

        input.close();


// unique digit count    
// ex-> 1015   ->  3(1,0,5)

         int [] arr = new int[10];
        while(input1>0){
            int r =input1%10;
            arr[r]++;
            input1=input1/10;
        }
        int c=0;
        for(int i:arr){
            if(i!=0){
                c++;
            }
        }
        System.out.println(c); 


// Non repitive digit count 
// 22-> 0
// 223 -> 1
 int [] arr1 = new int[10];
        while(input1>0){
            int r =input1%10;
            arr1[r]++;
            input1=input1/10;
        }
        int c1=0;
        for(int i:arr1){
            if(i!=0){
                c1++;
            }
        }
        System.out.println(c1);
        
    }
}
