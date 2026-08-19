package DSA.Stack;
import java.util.*;

class MyStack{
    List<Integer> list;

    public MyStack(){
        list = new ArrayList<Integer>();
    }

    public int top(){
        if(isEmpty()) return -1;
        return list.get(list.size()-1);
    }

    public boolean isEmpty(){
        return list.size() ==0;
    }

    public void push(int x){
        list.add(x);
    }

    public boolean pop(){
        if(isEmpty()) return false;
        list.remove(list.size()-1);
        return true;
    }

    public int size(){
        return list.size();
    }
}
public class Stack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.top());
        // stack.pop()
    }
}
