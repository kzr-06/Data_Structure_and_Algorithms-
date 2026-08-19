package DSA.Recursion.Number;

public class Reverse {
    public static void main(String[] args) {
        int ans = reverse1(1234);
        System.out.println(ans);
        ans = rev2(1234);
        System.out.println(ans);
    }

    public static int reverse1(int n){
        if(n<=9) return n;
        int length = (n == 0) ? 1 : (int) Math.log10(Math.abs(n));
        int mul = (int)Math.pow(10, length);
        return (n%10)*mul+ reverse1(n/10);
        
    }

    public static int rev2(int n){
        int digit = (int) Math.log10(Math.abs(n));
        return helper(n,digit);
    }
    public static int helper(int n , int digit){
        if(n<=9) return n;
        return (n%10) * (int)Math.pow(10, digit) + helper(n/10,digit-1);
    }
}
