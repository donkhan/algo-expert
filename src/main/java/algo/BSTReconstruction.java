package algo;
import java.util.*;

public class BSTReconstruction {

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(ArrayList<Integer> list) {
        BST root = newNode(list.get(0));
        for(int i = 1;i<list.size();i++){
            construct(root,list.get(i));
        }
        return root;
    }

    private BST newNode(Integer value){
        return new BST(value);
    }
    private BST construct(BST root, Integer value) {
        if(root == null) {
            root = newNode(value);
            return root;
        }
        BST node = root;
        while(true){
            if(node.value <= value) {
                if(node.right == null){
                    node.right = newNode(value);
                    break;
                }
                node = node.right;
            }else{
                if(node.left == null){
                    node.left = newNode(value);
                    break;
                }
                node = node.left;

            }
        }

        return root;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        /*list.add(10);list.add(4);list.add(2);list.add(1);
        list.add(5);list.add(17);list.add(19);list.add(18);*/
       // 2, 0, 1, 4, 3, 3
        list.add(2);list.add(0);list.add(1);list.add(4);list.add(3);list.add(3);
        BST root = new BSTReconstruction().reconstructBst(list);
        System.out.println();
    }
}
