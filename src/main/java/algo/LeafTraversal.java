package algo;

import java.util.*;

public class LeafTraversal {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }

        public String toString(){
            return "" + value;
        }
    }

    public boolean compareLeafTraversal(BinaryTree tree1, BinaryTree tree2) {
        List<BinaryTree> l1 = new ArrayList<>();
        List<BinaryTree> l2 = new ArrayList<>();
        getLeaves(tree1,l1);
        getLeaves(tree2,l2);
        System.out.println(l1);
        System.out.println(l2);

        if(l1.size() != l2.size()) return false;
        for(int i = 0;i<l1.size();i++){
            if(l1.get(i).value != l2.get(i).value) return false;
        }
        return true;
    }

    private void getLeaves(BinaryTree tree, List<BinaryTree> l1) {
        if(tree.left != null) getLeaves(tree.left,l1);
        if(tree.right != null) getLeaves(tree.right,l1);
        if(tree.left == null && tree.right == null) l1.add(tree);
    }

    public static void main(String args[]) {
        t5();
    }

    private static void t5(){
        BinaryTree t1n1 = new BinaryTree(2);
        BinaryTree t2n1 = new BinaryTree(1);
        System.out.println(new LeafTraversal().compareLeafTraversal(t1n1,t2n1));
    }

    private static void t4(){
        BinaryTree t1n1 = new BinaryTree(1);
        BinaryTree t1n2 = new BinaryTree(2);
        BinaryTree t1n3 = new BinaryTree(3);
        BinaryTree t1n4 = new BinaryTree(4);
        BinaryTree t1n5 = new BinaryTree(5);
        BinaryTree t1n6 = new BinaryTree(6);
        BinaryTree t1n7 = new BinaryTree(7);
        BinaryTree t1n8 = new BinaryTree(8);
        t1n1.left = t1n2; t1n1.right = t1n3;
        t1n2.left = t1n4; t1n2.right = t1n5;
        t1n3.right = t1n6;
        t1n5.left = t1n7; t1n5.right = t1n8;


        BinaryTree t2n1 = new BinaryTree(1);
        BinaryTree t2n2 = new BinaryTree(2);
        BinaryTree t2n3 = new BinaryTree(3);
        BinaryTree t2n4 = new BinaryTree(4);
        BinaryTree t2n5 = new BinaryTree(5);
        BinaryTree t2n6 = new BinaryTree(6);
        BinaryTree t2n7 = new BinaryTree(7);
        BinaryTree t2n8 = new BinaryTree(8);
        t1n1.left = t1n2; t1n1.right = t1n3;
        t1n2.left = t1n4; t1n2.right = t1n7;
        t1n3.right = t1n5;
        t1n5.left = t1n8; t1n5.right = t1n6;

        System.out.println(new LeafTraversal().compareLeafTraversal(t1n1,t2n1));
    }

}
