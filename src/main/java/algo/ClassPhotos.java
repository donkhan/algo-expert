package algo;
import java.util.*;

public class ClassPhotos {

    public static void main(String args[]) {
        t2();
    }

    private static void t1(){
        ArrayList<Integer> r = new ArrayList<>(); r.add(5);r.add(6);
        ArrayList<Integer> b = new ArrayList<>(); b.add(5);b.add(4);
        System.out.println(classPhotos(r,b));
    }

    private static void t2(){
        ArrayList<Integer> r = new ArrayList<>(); r.add(1);r.add(1);r.add(1);r.add(1);r.add(1);r.add(1);r.add(1);r.add(1);
        ArrayList<Integer> b = new ArrayList<>(); b.add(5);b.add(6);b.add(7);b.add(2);b.add(3);b.add(1);b.add(2);b.add(3);
        System.out.println(classPhotos(r,b));
    }
    public static boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        List<Integer> l1 = null;
        List<Integer> l2 = null;
        for(int i = 0;i<redShirtHeights.size();i++) {
            if(redShirtHeights.get(i) == blueShirtHeights.get(i)) continue;
            if (redShirtHeights.get(i) > blueShirtHeights.get(i)) {
                l1 = redShirtHeights;
                l2 = blueShirtHeights;
            } else {
                l1 = blueShirtHeights;
                l2 = redShirtHeights;
            }
        }
        if(l1 == null || l2 == null) {
            l1 = blueShirtHeights;
            l2 = redShirtHeights;
        }
        for(int i = 0;i<l1.size();i++){
            if(l1.get(i) < l2.get(i)){
                return false;
            }
        }
        return true;
    }
}
