package algo;

import java.util.*;

public class FindSuccessor {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }

        public String toString(){
            return "" + this.value;
        }
    }



    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        List<BinaryTree> traversedList = new ArrayList<>();
        inorderTraverse(tree,node,traversedList);
        for(int i = 0;i<traversedList.size()-1;i++){
            if(node == traversedList.get(i)) {
                return traversedList.get(i+1);
            }
        }
        return null;
    }

    private void inorderTraverse(BinaryTree tree, BinaryTree node, List<BinaryTree> traversedList) {
        if(tree.left != null) inorderTraverse(tree.left,node,traversedList);
        traversedList.add(tree);
        if(tree.right != null)  inorderTraverse(tree.right, node,traversedList);
    }

    public static void main(String args[]){
        BinaryTree n1 = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);
        BinaryTree n6 = new BinaryTree(6);
        n1.left = n2; n1.right = n3; n2.parent = n1; n3.parent = n1;
        n2.left = n4; n2.right = n5; n4.parent = n2; n5.parent = n2;
        n4.left = n6; n6.parent = n4;

        System.out.println(new FindSuccessor().findSuccessor(n1,n5));

    }
}
