package string;

public class Copy {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = str; // Copying reference of str to str1
        System.out.println("Original String: " + str);
        System.out.println("Copied String: " + str1);
    }
}
