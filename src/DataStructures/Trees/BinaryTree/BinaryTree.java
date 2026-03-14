package DataStructures.Trees.BinaryTree;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}

public class BinaryTree {
    static Node CreateNode(int val){
        return new Node(val);
    }



    static void DFS(Node root){
        if(root == null){
            return;
        }
        DFS(root.left);
        DFS(root.right);
        System.out.print(root.data+" ");


     }
     static void BFS(Node root) {
         Queue<Node> q = new LinkedList<>();
         q.offer(root);
         while (!q.isEmpty()) {
             Node front = q.poll();
             System.out.print(front.data+" ");
             if (front.left != null) {
                 q.offer(front.left);

             }
             if (front.right != null) {
                 q.offer(front.right);
             }
         }


     }
     static int Height(Node root){
        if (root== null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return Math.max(leftHeight,rightHeight )+1;

     }

    public static void main(String[] args) {
        Node root = CreateNode(1);
       root.left = CreateNode(2);
       root.right = CreateNode(3);
       root.left.left = CreateNode(4);
       root.left.right = CreateNode(5);
        root.right.right = CreateNode(6);
        root.right.left = CreateNode(7);
        root.left.right.left = CreateNode(8);
        root.right.left.left =  CreateNode(15);
        root.right.left.right = CreateNode(9);
         DFS(root);
        System.out.println();
         BFS(root);
        System.out.println();
        System.out.println(Height(root));



    }
}
