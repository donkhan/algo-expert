package algo;

import java.util.*;

public class MergeBinaryTrees {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        BinaryTree x = null;
        if(tree1 == null && tree2 == null){
            return x;
        }
        if(tree1 != null && tree2 != null){
            x = new BinaryTree(tree1.value + tree2.value);
            x.left =  mergeBinaryTrees(tree1.left, tree2.left);
            x.right = mergeBinaryTrees(tree1.right, tree2.right);
        }
        if(tree1 == null && tree2 != null) {
            x = tree2;
        }
        if(tree1 != null && tree2 == null) {
            x = tree1;
        }
        return x;
    }



    public static void main(String args[]) {
        t2();
    }

    public static void t1() {
        BinaryTree t1 = new BinaryTree(1);
        BinaryTree t1l1 = new BinaryTree(3);
        t1l1.left = new BinaryTree(7);
        t1l1.right = new BinaryTree(4);
        BinaryTree t1r1 = new BinaryTree(2);
        t1.left = t1l1;
        t1.right = t1r1;


        BinaryTree t2 = new BinaryTree(2);
        BinaryTree t2l1 = new BinaryTree(5);
        t2l1.left = new BinaryTree(2);

        BinaryTree t2r1 = new BinaryTree(9);
        t2.left = t2l1;
        t2.right = t2r1;
        t2r1.left = new BinaryTree(7);
        t2r1.right = new BinaryTree(6);


        BinaryTree m = new MergeBinaryTrees().mergeBinaryTrees(t1, t2);
        System.out.println(m.value);
        BinaryTree ml1 = m.left;
        System.out.println(ml1.value);
        BinaryTree mr1 = m.right;
        System.out.println(mr1.value);
        System.out.println(ml1.left.value);
        System.out.println(ml1.right.value);

        System.out.println(mr1.left.value);
        System.out.println(mr1.right.value);

    }

    public static void t2() {
        BinaryTree t1 = new BinaryTree(7);


        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n6 = new BinaryTree(6);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n7 = new BinaryTree(7);

        n2.left = n3; n2.right = n6;
        n3.right = n4;n6.right = n7;

        BinaryTree m = new MergeBinaryTrees().mergeBinaryTrees(t1, n2);
        System.out.println(m.value);
        System.out.println(m.left.value);System.out.println(m.right.value);
        System.out.println(m.left.right.value);System.out.println(m.right.right.value);


    }
}
