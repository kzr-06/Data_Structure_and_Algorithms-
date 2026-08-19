import java.util.Scanner;

public class BinarySearchTree {
       // Node class
    class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
        public int getValue(){
            return value;
        } 
    }

    private Node root;

     // Insert in BST
    public void insert(int value) {
        root = insert(root, value) ;
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }
    
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    
    // Display in BST

    public void display(){
        display(root,"Root Node:");
    }
    private void display(Node node,String details){
        if(node == null) return;

        System.out.println(details + node.value);
        display(node.left,"Left node is " + node.value+": ");
        display(node.right,"Right node is " + node.value +": ");
    }


    public boolean isEmpty(){
        return root == null;
    }

    public int height(Node node){
        if(node==null) return -1;
         return node.height;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();

        scanner.close();
}
}