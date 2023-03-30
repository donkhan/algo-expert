package algo;

import java.util.*;

class HeightBalancedBST {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int getHeight(BinaryTree tree){
        if(tree == null) return 0;
        int lh = getHeight(tree.left) + 1;
        int rh = getHeight(tree.right) + 1;
        int h = lh;
        if(h < rh) h = rh;
        return h;
    }

    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        if(tree == null) return true;
        int lh = getHeight(tree.left);
        int rh = getHeight(tree.right);
        if(Math.abs( lh - rh) > 1 ) return false;
        return heightBalancedBinaryTree(tree.left) && heightBalancedBinaryTree(tree.right);
    }

    public static void main(String args[]){
        BinaryTree n1 = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);
        BinaryTree n6 = new BinaryTree(6);

        n1.left = n2; n1.right = n3;
        n2.left = n4;
        n3.right = n5;
        n4.left = n6;


        HeightBalancedBST h = new HeightBalancedBST();
        System.out.println(h.heightBalancedBinaryTree(n1));
    }
}
