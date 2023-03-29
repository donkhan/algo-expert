package algo;

import java.util.*;

public class BinarySearchTree {
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if(tree != null) {
            inOrderTraverse(tree.left, array);
            array.add(tree.value);
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if(tree != null) {
            array.add(tree.value);
            inOrderTraverse(tree.left, array);
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if(tree != null) {
            inOrderTraverse(tree.left, array);
            inOrderTraverse(tree.right, array);
            array.add(tree.value);
        }
        return array;
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
        BST b1 = new BST(10);
        b1.left = new BST(2);
        b1.right = new BST(12);

        List<Integer> array = new ArrayList<>();
        BinarySearchTree.inOrderTraverse(b1,array);
        array.stream().forEach(System.out::println);

    }
}
