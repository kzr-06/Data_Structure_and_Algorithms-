/*
 Program to swap first element with last, second to second last and so on (reversing elements).

Example:

Input:
Array elements are: 
10, 20, 30, 40, 50

Output:
Array elements after swapping (reversing):
50, 40, 30, 20, 10
Input Format

Take an integer n from the user as the size of array.
Take n elements from the user.
Constraints

n>=1 && n<=10000
Output Format

It should print the elements of array after swapping.
Sample Input 0

4
1 2 3 4
Sample Output 0

4 3 2 1
 */

import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int j=(Integer)(n/2);
        for(int i=0,y=n-1; i<j;i++,y--){
            int temp = arr[y];
            arr[y] = arr[i];
            arr[i] = temp;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
