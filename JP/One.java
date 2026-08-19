// Q-1 | Problem Statement

// Once upon a time in a quaint little village called Parenthesiville, there lived a group of curious villagers who were fascinated by the art of balance. They often spent their days crafting intricate designs using colorful ribbons shaped like parentheses: '(', ')'—each representing their hopes and dreams.
// One day, a wise elder announced a grand festival to celebrate the beauty of balance. To participate, villagers were asked to create the longest chain of valid parentheses, where every opening parenthesis must be perfectly matched with a closing one, forming harmonious pairs. However, the villagers soon realized that crafting these chains was trickier than it seemed!
// To help them, you have been appointed as the official judge of the festival. Your task is to write a function that will determine the length of the longest valid parentheses substring from a given string. The substring must contain pairs of matching parentheses in the correct order, symbolizing the villagers' hopes united in perfect harmony.

// Constraints:
// 0 <= s.length <= 3 *10^4
// s[i] is '(', or ')'

// Input: s = "(()"
// Output: 2
// Explanation: The longest valid parentheses substring is "()".

// Input 0:
// ((())
// Output 0: 4

// Input 1: ((()))
// Output 1: 6

// Input 2: (()))))))(())
// Output 2: 4

// Input 3: (()))))))((()))
// Output 3: 6



package JP;

import java.util.Stack;

public class One {
    public static void main(String[] args) {
        String s ="(()))))))((()))";
        int max = 0;
        int count=0;
        Stack<Character> stack = new Stack<>();
        // stack.push((char)-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') stack.push(ch);
            else if(!stack.isEmpty() &&ch==')' ) {
                stack.pop();
                count +=2;
            }
            max = Math.max(max, count);
            if(stack.isEmpty()) count =0;
        }
        System.out.println(max);
    }
    
}
