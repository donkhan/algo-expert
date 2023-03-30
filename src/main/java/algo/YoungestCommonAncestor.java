package algo;
import java.util.*;

public class YoungestCommonAncestor {
    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        List<AncestralTree> l1 = new ArrayList<>();
        List<AncestralTree> l2 = new ArrayList<>();
        AncestralTree tmp = descendantOne;
        while(tmp != null){
            l1.add(tmp);
            tmp = tmp.ancestor;
        }
        for(int i = 0;i<l1.size();i++) System.out.print("  " + l1.get(i).name);
        System.out.println();
        tmp = descendantTwo;
        while(tmp != null){
            l2.add(tmp);
            tmp = tmp.ancestor;
        }
        for(int i = 0;i<l2.size();i++) System.out.print("  " + l2.get(i).name);
        tmp = null;
        boolean found = false;
        for(int i = 0;i<l1.size();i++){
            tmp = l1.get(i);
            for(int j = 0;j<l2.size();j++){
                if(tmp == l2.get(j)) {
                    topAncestor = tmp;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return topAncestor; // Replace this line
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }

    public static void main(String args[]){
        AncestralTree a = new AncestralTree('A');
        AncestralTree b = new AncestralTree('B');
        AncestralTree[] d = new AncestralTree[1];
        d[0] = b;
        a.addAsAncestor(d);

        System.out.println(YoungestCommonAncestor.getYoungestCommonAncestor(a,a,b));
    }
}
