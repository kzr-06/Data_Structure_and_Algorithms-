import java.util.Stack;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(hasRedundantBraces("((a+b))"));


    }
    // given a string A denoting a expression it contains the following operation +-*/  check whether a has redundant braces or not 
    //  a will always a valid expression and will not contain any wide spaces
    public static boolean hasRedundantBraces(String A) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : A.toCharArray()) {
            if (c == ')') {
                int operatorCount = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    if (stack.peek() == '+' || stack.peek() == '-' || 
                        stack.peek() == '*' || stack.peek() == '/') {
                        operatorCount++;
                    }
                    stack.pop();
                }
                stack.pop(); // remove '('
                
                // If no operators inside braces, they are redundant
                if (operatorCount == 0) {
                    return true;
                }
            } else if (c != ' ') {
                stack.push(c);
            }
        }
        
        return false;
    }
}

