package algo;

import java.util.*;

public class ValidateThreeNodes {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }

        public String toString(){
            return "" + value;
        }
    }

    private boolean isChild(BST parent, BST child){
        boolean b = false;
        if(!b && parent.left != null) {
            b = parent.left.value == child.value;
            if(!b) b = b | isChild(parent.left, child);
        }
        if(!b && parent.right != null){
            b = parent.right.value == child.value;
            if(!b) b = b | isChild(parent.right, child);
        }
        return b;
    }


    public boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
        // Write your code here.
        return (isChild(nodeOne, nodeTwo) && isChild(nodeTwo, nodeThree)) ||
                (isChild(nodeThree, nodeTwo) && isChild(nodeTwo, nodeOne));
    }

    public  static  void main(String args[]){
        BST n5 = new BST(5);
        BST n2 = new BST(2); n5.left = n2;
        BST n7 = new BST(7); n5.right = n7;
        BST n1 = new BST(1); n2.left = n1;
        BST n4 = new BST(4); n2.right = n4;
        BST n0 = new BST(0); n1.left = n0;
        BST n3 = new BST(3); n4.left = n3;
        BST n6 = new BST(6); n7.left = n6;
        BST n8 = new BST(8); n7.right = n8;
        boolean b = new ValidateThreeNodes().validateThreeNodes(n5,n2,n3);
        System.out.println(b);
    }
}
