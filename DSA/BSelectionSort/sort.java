package DSA.BSelectionSort;

public class sort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,4,1,5,3};
        // int[] arr1 = selectionSort(arr);
        selectionRec(arr, arr.length, 0, 0);
        for(int num:arr){
            System.out.print( num);;
        }
    }

    public static int[] selectionSort(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            int max =0;
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[max]) max = j;
            }
            int last = nums.length-1-i;
            int temp = nums[last];
            nums[last] = nums[max];
            nums[max] = temp;
        }
        return nums;
    }

    public static void selectionRec(int[] nums , int last , int start , int max){
        if(last == 0) return ;

        if(start<last){
            if(nums[start] > nums[max]) {
                selectionRec(nums, last, start+1, start);
            }else{
                 selectionRec(nums, last, start +1, max);
                }

        }else{ 
        int temp = nums[max];
        nums[max] = nums[last -1];
        nums[last -1] = temp;}
        selectionRec(nums, last-1, 0, 0);
    }
}
