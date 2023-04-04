package algo;
import java.util.*;

public class SymmetricalTree {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    private void left_right_root(BinaryTree node,List buffer){
        if(node == null) return;
        left_right_root(node.left, buffer);
        left_right_root(node.right,buffer);
        buffer.add(node.value);
    }

    private void right_left_root(BinaryTree node,List buffer){
        if(node == null) return;
        right_left_root(node.right, buffer);
        right_left_root(node.left,buffer);
        buffer.add(node.value);
    }

    public boolean symmetricalTree(BinaryTree tree) {
        // Write your code here.
        List<Integer> left = new ArrayList();
        left_right_root(tree.left, left);
        List<Integer> right = new ArrayList<>();
        right_left_root(tree.right, right);
        if(left.size() != right.size()) return false;
        for(int i = 0;i<left.size();i++){
            if(left.get(i) != right.get(i)) return false;
        }
        return true;
    }



    public static void main(String args[]) {
        t1();
    }

    private  static void t7(){
        BinaryTree root = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n2_2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n3_2 = new BinaryTree(3);
        root.left = n2; root.right = n2_2;
        n2.left = n3;
        n2.right = n3_2;
        System.out.println(new SymmetricalTree().symmetricalTree(root));
    }

    private static void t1(){
        BinaryTree root = new BinaryTree(1);
        BinaryTree n21 = new BinaryTree(2);
        BinaryTree n22 = new BinaryTree(2);
        root.left = n21; root.right = n22;
        BinaryTree n31 = new BinaryTree(3);
        BinaryTree n32 = new BinaryTree(3);
        BinaryTree n41 = new BinaryTree(4);
        BinaryTree n42 = new BinaryTree(4);
        n21.left = n31; n21.right = n41;
        n22.left = n42; n22.right = n32;
        BinaryTree n51 = new BinaryTree(5);
        BinaryTree n52 = new BinaryTree(5);
        BinaryTree n61 = new BinaryTree(6);
        BinaryTree n62 = new BinaryTree(6);
        n31.left = n51;n31.right = n61;
        n32.left = n62;n32.right = n52;

        System.out.println(new SymmetricalTree().symmetricalTree(root));
    }
}
