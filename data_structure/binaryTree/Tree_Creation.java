package data_structure.binaryTree;

import java.util.Scanner;

class Node{
    Node left,right;
    int data;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}


public class Tree_Creation {

    static Node create(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter value:");
        int data = sc.nextInt();
        if (data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left child of the "+root);
        root.left = create();
        System.out.println("Enter right child of the "+root);
        root.right = create();

        return root;
    }


    public static void main(String[] args) {
   Node root = create();

    }
}
