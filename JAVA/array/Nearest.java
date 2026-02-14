/*
Program to find nearest lesser and greater element in an array.

Input Format

Take an integer n from the user as the size of array.
Take n elements of the array from the user.
Take the element el from the user whose nearest smallest and largest is to be find.
Constraints

n>=1 && n<=10000
Output Format

It should print the nearest smallest and largest of the given element.
If entered element is not found in array then print "Not found.".
Sample Input 0

3
1 2 3
2
Sample Output 0

1
3
Sample Input 1

3
1 2 3
5
Sample Output 1

Not found.
 */

import java.util.Scanner;

public class Nearest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int no=input.nextInt();
        int f=0;
        for(int i=0;i<n;i++){
            if(no==arr[i] && i==0){
                f=1;
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                break;
            }
            else if(no==arr[i] && i==n-1){
                f=1;
                System.out.println(arr[n-2]);
                System.out.println(arr[n-1]);
                break;
            }
            else if(no==arr[i]){
                f=1;
                System.out.println(arr[i-1]);
                System.out.println(arr[i+1]);
                break;
            }
        }
        if(f==0){
            System.out.println("Not Found");
        }
        input.close();

    }
}
