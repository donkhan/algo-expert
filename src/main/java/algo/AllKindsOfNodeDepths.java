package algo;

import java.util.*;

public class AllKindsOfNodeDepths {

    public static void main(String args[]){
        BinaryTree n1 = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);
        BinaryTree n8 = new BinaryTree(8);
        BinaryTree n9 = new BinaryTree(9);
        BinaryTree n6 = new BinaryTree(6);
        BinaryTree n7 = new BinaryTree(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4; n2.right = n5;
        n4.left = n8; n4.right = n9;
        n3.left = n6; n3.right = n7;

        System.out.println(allKindsOfNodeDepths(n1));
    }

    private static int addDepths(BinaryTree node, int level){
        int t = level;
        if(node.left != null) t = t + addDepths(node.left, level + 1);
        if(node.right != null) t = t + addDepths(node.right, level + 1);
        //System.out.println(node.value + "  " + t);
        return t;
    }

    private static boolean isRoot(BinaryTree node){
        if(node == null) return false;
        return node.left != null || node.right != null;
    }
    public static int allKindsOfNodeDepths(BinaryTree root) {
        // Write your code here.
        int t =  addDepths(root,0);
        if(isRoot(root.left)) t = t + allKindsOfNodeDepths(root.left);
        if(isRoot(root.right)) t = t + allKindsOfNodeDepths(root.right);
        return t;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public String toString(){
            return "" + value;
        }
    }
}
