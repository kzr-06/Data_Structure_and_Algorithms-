package DSA.Recursion.Number;

public class Count_zeroes {
    public static void main(String[] args) {
        System.out.println(count1(12000));
    }


    public static int count1(int n){
       return helper(n,0);
    }

    public static int  helper(int n,int sum){
         if(n<=9){
            return sum;
        }
        int r = n%10;
        if(r==0) sum+=1;
        return helper(n/10,sum);
    }
}