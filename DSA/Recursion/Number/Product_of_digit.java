package DSA.Recursion.Number;

public class Product_of_digit {
   public static void main(String[] args) {
        int ans = product(4321);
        System.out.println(ans);
    }

    public static int product(int n){

        if(n<=9) return n;

        return n%10 * product(n/10);
    } 
}
