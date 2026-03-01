package JAVA;
import java.io.*;
// import java.util.*;

class Solution {
   
    public int Search(int[] arr,int target) {
       
         
	    int left = 0;
	    int right = arr.length-1;
	    int ans = -1;  
	    
	    while (left<=right) 
	    {
	       int mid =left+(right-left)/2; 
	       
	       if(arr[mid]>=arr[arr.length-1])
	       {
	           ans=mid;
	           right=mid-1;
	       }
	       else
	       {
	           left=mid+1;
	       }
	    }
        System.out.println(ans);
	    
	    if(arr[ans]>=target && arr[arr.length-1]<=target){
	        left=ans;
	        right=arr.length-1;
	        while (left<=right)
	    {
	       int mid =left+(right-left)/2; 
	       
	       if(arr[mid]==target)
	       {
	           ans=mid;
	           right=mid-1;
	       }
	       else  
	       {
	           left=mid+1;
	       }
	    }
        System.out.println(ans);
	    return ans;
	    }
	    else{
	        left=0;
	        right=ans-1;
	        while (left<=right) 
	    {
	       int mid =left+(right-left)/2; 
	       
	       if(arr[mid]==target)
	       { 
	           ans=mid;
	           right=mid-1;
	       }
	       else
	       {
	           left=mid+1;
	       }
	    }
        System.out.println(ans);
	    return ans;
	    }

    }
}

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        // Number of test cases
        int t = Integer.parseInt(read.readLine().trim());
        
        while (t-- > 0) {
            // Read the number of integers
            int N = Integer.parseInt(read.readLine().trim());
            
            // Read the array of integers
            String[] input = read.readLine().trim().split(" ");
            int[] arr = new int[N];
            
            int target = Integer.parseInt(read.readLine().trim());
            
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            
            // Call the function and print the result for this test case
            System.out.println(ob.Search(arr,target)); // Replace findSum with your function
        
            System.out.println("~");
        }
    }
}






//Okay let me not complicate the things....you can see in a rotated sorted array you have basically 2 sorted arrays combined..
//Like in arr = [8,9,10,1,2,3,4,5,6,7] there are two sorted array parts....8,9,10 and 1,2,3,4,5,6,7 ....
//Just find out the index where this breakpoint is (minimum element :) the question we did before this one call it P)
//Search in 0 to P-1 region then in P to N-1 region....Deal DONE!\





        //Write code here to find out first Number that satisfies a condition of giving True reply to REPLY() function...
        //It is guranteed
        //That the number is lesser then 1000