/*
 You are given N numbers. You have to find the max difference between a pair of numbers.

Input Format

First line contains T, number of testcases.
For each testcase:
First line contains N
Second line contains N spaces separated integers.

Constraints

0 < |T,N,Ai| < 1000000

Output Format

For each testcase, print max diff.

Sample Input 0
1
2
2 4

Sample Output 0
2
 */

import java.util.*;
public class Max_Diff {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int k=0;k<t;k++){
            int n = input.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = input.nextInt();        
            }
            
            // Bubble Sort
            for(int j=1;j<n;j++){
                for(int i=0;i<n-j;i++){
                    if(arr[i]>arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }
            System.out.println(arr[n-1]-arr[0]);
        }
        input.close();
    }
}
