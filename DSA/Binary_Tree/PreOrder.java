import java.util.*;

public class PreOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // {int[] arr1 = new int[n];
        // for(int i=0;i<n;i++){
        //     arr1[i] = input.nextInt();
        // }
        // int m = input.nextInt();
        // int[] arr2 = new int[m];
        // for(int i=0;i<m;i++){
        //     arr2[i] = input.nextInt();
        // }
        // int[] ans = new int[n];
        // for(int i=0;i<n;i++){
        //     int index=-1;
        //     // find position of element of arr1 in arr2
        //     for(int j=0;j<m;j++){
        //         if(arr2[j] == arr1[i]){
        //             index=j;
        //             break;
        //         }
        //     }
        //     int c=-1;
        //     for(int j=index+1;j<m;j++){
        //         if(arr2[j] > arr1[i]){
        //             c=arr2[j];
        //             break;
        //         }
        //     }
        //     ans[i] = c;;
        // }
        // System.out.println(Arrays.toString(ans));}

        // String[] arr = new String[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = input.next();
        // }
        // Stack<String> s1 = new Stack<>();
        // Stack<String> s2 = new Stack<>();
        // for(String s:arr){
        //     s1.push(s);
        // }
        // for(String s:arr){   
        //     s2.push(s1.pop());
        // }
        
        // String[] arr = new String[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = input.next();
        // }
        // Stack<Integer> stack = new Stack<>();
        // for(String ch :arr){
        //     if(stack.isEmpty() && !ch.equals(("C")) && !ch.equals(("D")) && !ch.equals(("+")) ) {
        //         stack.push(Integer.parseInt(ch.toString()));
        //     }
        //     else if(ch.equals(("C"))){
        //         if(!stack.isEmpty()) stack.pop();
        //     }
        //     else if(ch.equals(("D"))){
        //         stack.push(stack.peek()*2);
        //     }
        //     else if(ch.equals(("+"))){
        //         int p = stack.pop();
        //         int ans = stack.peek() + p;
        //         stack.push(p);
        //         stack.push(ans);
        //     }else stack.push(Integer.parseInt(ch.toString()));
        // }
        // int ans = 0;
        // while(!stack.isEmpty()) ans+=stack.pop();
        // System.out.println(ans);
        
        // String s = input.next();
        // Stack<Character> stack = new Stack<>();
        // for(Character ch :s.toCharArray()){
        //     if(stack.isEmpty()) stack.push(ch);
        //     else if(stack.peek() == ch){
        //             stack.pop();
        //             continue;
        //         }
        //     else{
        //         stack.push(ch);
        //     }
        //     }
        // while (!stack.isEmpty()) { System.out.println(stack.pop());   
        // }
        

        String s = input.next();
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch =='{' ||ch=='[') stack.push(ch);
            else{
                char top = stack.peek();
                if(ch==')' && top !='(') {
                    System.out.println(false);
                    break;
                }
                else if(ch=='}' && top !='{') {
                    System.out.println(false);
                    break;
                }
                else if(ch==']' && top !='[') {
                    System.out.println(false);
                    break;
                }
                else stack.pop();
            }
        }
        if(stack.isEmpty()) System.out.println(true);
        input.close();
}
}
