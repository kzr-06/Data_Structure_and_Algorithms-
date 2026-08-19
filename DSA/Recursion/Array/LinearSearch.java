package DSA.Recursion.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(check(arr, 3, 0));
        System.out.println(check1(arr, 3, 0));
        System.out.println(checkLast(arr, 3, arr.length-1));
    }
    public static boolean check(int[] arr,int target,int idx){
        if(idx == arr.length) return false;
        // if(arr[idx] == target) return true;
        // return check(arr,  target, idx+1);
        return arr[idx] == target || check(arr, target, idx+1);
    }
    

    public static int check1(int[] arr,int target,int idx){
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        return check1(arr,  target, idx+1);
    }

    public static int checkLast(int[] arr,int target,int idx){
        if(idx == -1) return -1;
        if(arr[idx] == target) return idx;
        return checkLast(arr,  target, idx-1);
    }

    
}

