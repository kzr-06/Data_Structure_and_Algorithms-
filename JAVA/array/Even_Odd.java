
/*
 Program to replace all EVEN elements by 0 and Odd by 1 in One Dimensional Array.

To replace EVEN and ODD elements by 0 and 1, we will check each elements whether it is EVEN or ODD, if it is EVEN assign 0 otherwise assign 1 to the variable with index. For example arr[i] is EVEN, then we will assign arr[i]=0;

Input Format

Take an integer n from the user as the size of array.
Take n elements from the user.
Constraints

n>=1 && n<=100000
Output Format

It should print the array after all replacements.

Sample Input 0
5
2 3 4 5 6

Sample Output 0
0 1 0 1 0
 */

import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = input.nextInt();
        }
        
        for(int i=0; i<n ; i++){
            if(arr[i] % 2 == 0){
                arr[i]=0;
            }
            else{
                arr[i] = 1;
            }
        }

        for(int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
        
    }
}
