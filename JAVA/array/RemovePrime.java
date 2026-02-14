/*
 Program to delete prime numbers from an array.

Example:

Input:
Array elements are: 
100, 200, 31, 13, 97, 10, 20, 11

Output:
Array elements after removing prime numbers: 
100
200
 10
 20
Input Format

Take an integer n for the size of array.
Take n elements for the array from the user.
Constraints

n>0 && n<=10000
array[n]>0 && array[n]<=10000
Output Format

It should print the array after removing the prime numbers.
Sample Input 0
5
7 11 15 16 19

Sample Output 0
15 16
 */

import java.util.Scanner;

public class RemovePrime {
    public static boolean prime(int n) {
    
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                
                return false;
            }
        }
        return true;

        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        for(int i=0;i<n;i++){
            boolean isprime = prime(arr[i]);
            if(isprime){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                n--;
                i--;
            }
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
