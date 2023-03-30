package algo;

import java.util.*;

public class ValidateBST {

    private static int lmax(BST node){
        int v = Integer.MIN_VALUE;
        if(node != null) {
            v = node.value;
            int l = lmax(node.left);
            int r = lmax(node.right);
            if (v < l) v = l;
            if (v < r) v = r;
        }
        return v;
    }
    private static int lmin(BST node){
        int v = Integer.MAX_VALUE;
        if(node != null) {
            v = node.value;
            int l = lmin(node.left);
            int r = lmin(node.right);
            if (v > l) v = l;
            if (v > r) v = r;
        }
        return v;
    }
    public static boolean validateBst(BST tree) {
        if(tree == null) return true;
        int v = tree.value;
        if(tree.left != null){
            if(v <= lmax(tree.left)) return false;
        }
        if(tree.right != null){
            if(v > lmin(tree.right)) return false;
        }
        return validateBst(tree.left) && validateBst(tree.right);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String args[]){
        BST n10 = new BST(10);
        BST n15 = new BST(15);
        BST n22 = new BST(22);
        BST n13 = new BST(13);
        BST n14 = new BST(14);


        BST n5 = new BST(5);
        BST n5_2 = new BST(5);
        BST n2 = new BST(2);
        BST n1 = new BST(1);

        n10.left = n5; n10.right = n15;
        n15.left = n13; n15.right = n22;
        n13.right = n14;
        n5.left = n2; n5.right = n5_2;
        n2.left = n1;




        System.out.println(ValidateBST.validateBst(n10));

    }


}
