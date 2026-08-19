package DSA.Recursion.Number;

public class Palindrome {
     public static int rev2(int n){
        int digit = (int) Math.log10(Math.abs(n));
        return helper(n,digit);
    }
    public static int helper(int n , int digit){
        if(n<=9) return n;
        return (n%10) * (int)Math.pow(10, digit) + helper(n/10,digit-1);
    }

    public static boolean palindrome(int n){
        if(n == rev2(n)) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(1221));
    }
}
