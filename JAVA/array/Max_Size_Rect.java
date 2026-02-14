/*
You are given length of N rods. You have two identical pieces of each of the given rods. You have to find two types of rods such that if you make a rectangle with them, Area of that rectangle is the maximum possible. Print the max area possible.

Input Format

First line contains Number of testcases T. For each test case T, First line contains Number of rods N Second line contains N space separated integers displaying rod length.

Constraints

0 < |T,N,Li| < 1000000000

Output Format

T lines where each line contains the max area of rectangle.

Sample Input 0

2
39
38 35 34 11 50 5 21 18 8 29 26 47 7 25 28 42 22 6 47 21 34 36 23 48 27 21 37 8 36 5 31 42 27 45 17 50 21 10 15
43
39 37 48 20 22 20 20 12 30 13 16 50 9 11 13 13 33 47 21 29 7 20 21 39 39 35 15 50 43 49 38 5 50 7 50 24 48 44 21 34 37 32 50

Sample Output 0

2500
2500 

 */

import java.util.Scanner;

public class Max_Size_Rect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++){

            int n = input.nextInt();
            int[] arr = new int[n];
            int max;
            int smax;

            for(int j=0; j<n; j++){
                arr[j]=input.nextInt();
            }

            if(n==1){
                max =smax = arr[0];
                
            }

            else{
            if(arr[0]>arr[1]){
                max=arr[0];
                smax=arr[1];
            }

            else {
                max=arr[1];
                smax=arr[0];
            }

            for(int j:arr){ // we can now iterate from index 2
                if(j>max){
                    smax=max;
                    max=j;;
                }
                else if(j>smax && j<=max){
                    smax=j;
                }

            }
            }
            

            System.out.println(smax);
            System.out.println(max);
            System.out.println(smax*max);

        }
        input.close();
    }
}
