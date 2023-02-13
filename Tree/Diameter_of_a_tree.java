package Tree;
import java.util.*;
public class Diameter_of_a_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftht = height(root.left);
        int rightht = height(root.right);

        return Math.max(leftht, rightht) + 1;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);
        int leftht = height(root.left);
        int rightht = height(root.right);
        int selfdia = leftht + rightht + 1;
        return Math.max(Math.max(leftdia, rightdia), selfdia);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
