package algo;

import java.util.*;

public class FindClosestValue {

    private static void findChildren(BST node, List<Integer> list){
        if(node != null) list.add(node.value);
        if(node.left != null)
            findChildren(node.left, list);
        if(node.right != null)
            findChildren(node.right, list);
    }

    public static int findClosestValueInBst(BST tree, int target) {
        List<Integer> list = new ArrayList<>();
        findChildren(tree,list);
        int closest = Integer.MAX_VALUE;
        int closeN = 0;
        for(int i : list){
            if(Math.abs(i - target) < closest) {
                closest = Math.abs(i - target);
                closeN = i;
            }
        }
        return closeN;
    }
    public static int findClosestValueInBstX(BST tree, int target) {
        int r = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        if (tree.value <= target) {
            if (tree.right != null)
                r = findClosestValueInBst(tree.right, target);
        }
        if (tree.value > target) {
            if (tree.left != null)
                l = findClosestValueInBst(tree.left, target);
        }

        if(tree.left == null && tree.right == null){
            return tree.value;
        }
        int diff = Math.abs(tree.value - target);
        if(tree.left == null && tree.right != null){
            int rdiff = Math.abs(tree.right.value - target);
            if(diff < rdiff){
                return tree.value;
            }
            return r;
        }
        if(tree.right == null && tree.left != null){
            int ldiff = Math.abs(tree.left.value - target);
            if(diff < ldiff)
                return tree.value;
            return l;
        }
        int ldiff = Math.abs(l - target);
        int rdiff = Math.abs(r - target);
        if(ldiff < diff && ldiff < rdiff) {
            return l;
        }
        if(rdiff < diff && rdiff < ldiff) {
            return r;
        }
        return tree.value;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public String toString() {
            return "" + this.value;
        }
    }

    public static void main(String args[]) {
        t2();
    }

    private static void t2() {
        BST n100 = new BST(100);
        BST n5 = new BST(5);
        BST n502 = new BST(502);
        BST n5500 = new BST(55000);
        BST n1001 = new BST(1001);
        BST n4500 = new BST(4500);
        BST n203 = new BST(203);
        BST n204 = new BST(204);
        BST n205 = new BST(205);
        BST n206 = new BST(206);
        BST n207 = new BST(207);
        BST n208 = new BST(208);

        n100.left = n5;n100.right = n502;
        n502.left = n204; n502.right = n5500;
        n5500.left = n1001;
        n1001.left = n4500;
        n204.left = n203; n204.right = n205;
        n205.right = n207;
        n207.left = n206;
        n207.right = n208;

        BST n15 = new BST(15);
        BST n22 = new BST(22);
        BST n57 = new BST(57);
        BST n60 = new BST(60);
        BST n2 = new BST(2);
        BST n5_2 = new BST(5);
        n5.left = n2;n5.right = n15;
        n15.left = n5_2;n15.right = n22;
        n22.right = n57;
        n57.right = n60;
        BST n1 = new BST(1);
        BST n1_2 = new BST(1);
        BST n1_3 = new BST(1);
        BST n1_4 = new BST(1);
        BST n1_5 = new BST(1);
        BST n_m51 = new BST(-51);

        BST n3 = new BST(3);
        n2.left = n1; n2.right = n3;
        n1.left = n_m51;
        n1_2.right = n1_3;
        n1_3.right = n1_4;
        n1_4.right = n1_5;

        BST n_m403 = new BST(-403);
        n_m51.left = n_m403;

        System.out.println(FindClosestValue.findClosestValueInBst(n100, -1));

    }

    private static void t1() {
        BST n10 = new BST(10);
        BST n5 = new BST(5);
        BST n15 = new BST(15);
        BST n2 = new BST(2);
        BST n5_2 = new BST(5);
        BST n13 = new BST(13);
        BST n22 = new BST(22);
        BST n1 = new BST(1);
        BST n14 = new BST(14);

        n10.left = n5;
        n10.right = n15;
        n5.left = n2;
        n5.right = n5_2;
        n2.left = n1;
        n15.left = n13;
        n15.right = n22;
        n13.right = n14;

        System.out.println(FindClosestValue.findClosestValueInBst(n10, 12));
    }
}
