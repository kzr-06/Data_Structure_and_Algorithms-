package DSA.Recursion.Array;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        System.out.println(check(arr));
    }    

    public static boolean check(int[] arr){
        return helper(arr,0);
    }

    public static boolean helper(int[] arr,int idx){
        if(idx == arr.length-1) return true;
        // if(arr[idx] > arr[idx+1]) return false;
        // return helper(arr, idx+1);


        return arr[idx] < arr[idx+1] && helper(arr, idx+1);
    }
}

