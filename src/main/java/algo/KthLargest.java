package algo;

import java.util.*;

public class KthLargest {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    private void traverse(BST tree, List<BST> list){
        if(tree.right != null) traverse(tree.right, list);
        list.add(tree);
        if(tree.left != null) traverse(tree.left,list);

    }

    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        List<BST> list = new ArrayList<>();
        traverse(tree,list);
        return list.get(k-1).value;
    }

    public  static  void main(String args[]){
        BST n15 = new BST(15);
        BST n5 = new BST(5);
        BST n20 = new BST(20);
        n15.left = n5; n15.right = n20;
        BST n2 = new BST(2);
        BST n52 = new BST(5);
        n5.left = n2; n5.right = n52;
        BST n1 = new BST(1);
        BST n3 = new BST(3);
        n2.left = n1; n2.right = n3;
        BST n17 = new BST(17);
        BST n22 = new BST(22);
        n20.left = n17;
        n20.right = n22;


        int x = new KthLargest().findKthLargestValueInBst(n15,2);
        System.out.println(x);
    }
}
