

import java.util.Scanner;

public class BinaryTree {

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    // Create root
    public void populate(Scanner scanner) {
        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    // Insert nodes
    private void populate(Scanner scanner, Node node) {

        // Left child
        System.out.print("Do you want to enter left of " + node.data + " (true/false): ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter value for left of " + node.data + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        // Right child
        System.out.print("Do you want to enter right of " + node.data + " (true/false): ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter value for right of " + node.data + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // Display tree
    public void display() {
        System.out.println("\nTree structure:");
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.data);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    // MAIN METHOD (entry point)
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();

        scanner.close();
    }
}