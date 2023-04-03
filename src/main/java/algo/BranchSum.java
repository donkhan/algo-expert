package algo;

import java.util.*;

public class BranchSum {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private static void ex(BinaryTree node,int v,List<Integer> l){
        if(node.left == null && node.right == null){
            l.add(v + node.value);
            return;
        }
        if(node.left != null)
        ex(node.left,v + node.value,l);
        if(node.right != null)
        ex(node.right,v + node.value,l);
    }
    public static List<Integer> branchSums(BinaryTree node) {
        List l = new ArrayList<Integer>();
        ex(node,0,l);
        return l;
    }

    public static  void main(String args[]){
        BinaryTree root = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        root.left = n2; root.right = n3;

        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);
        BinaryTree n6 = new BinaryTree(6);
        BinaryTree n7 = new BinaryTree(7);

        BinaryTree n8 = new BinaryTree(8);
        BinaryTree n9 = new BinaryTree(9);
        BinaryTree n10 = new BinaryTree(10);


        n2.left = n4; n2.right = n5;
        n3.left = n6; n3.right = n7;
        n4.left = n8; n4.right = n9;
        n5.left = n10;

        List<Integer> x = branchSums(root);
        for(int y : x){
            System.out.println(y);
        }
    }

}
