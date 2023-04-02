package algo;

import java.util.*;

public class NodeDepth {

    static int depth(BinaryTree r, int n){
        if(r == null) return 0;
        return n + depth(r.left,n + 1) + depth(r.right, n+1);
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return depth(root,0);
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
    }

    public static void main(String args[]){
        BinaryTree n1 = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);
        BinaryTree n6 = new BinaryTree(6);
        BinaryTree n7 = new BinaryTree(7);
        BinaryTree n8 = new BinaryTree(8);
        BinaryTree n9 = new BinaryTree(9);
        n1.left = n2; n1.right = n3;
        n2.left = n4; n2.right = n5;
        n4.left = n8; n4.right = n9;
        n3.left = n6; n3.right = n7;
        System.out.println(nodeDepths(n1));
    }
}
