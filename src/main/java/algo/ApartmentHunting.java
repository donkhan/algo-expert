package algo;
import java.util.*;

public class ApartmentHunting {

    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        // Write your code here.
        int w[][] = new int[blocks.size()][reqs.length];
        int d[] = new int[blocks.size()];
        int m[] = new int[blocks.size()];
        for(int i = 0;i<blocks.size();i++){
            int distance = 0;
            Map<String, Boolean> map = blocks.get(i);
            for(int j = 0;j<reqs.length;j++){
                String req = reqs[j];
                if(map.get(req)){
                    w[i][j] = 0;
                    continue;
                }
                int backward = findBackward(blocks,i-1,req);
                int forward = findForward(blocks,i+1,req);
                int less = backward;
                if(less > forward) less = forward;
                w[i][j] = less;
                distance = distance + less;
            }
            m[i] = max(w[i]);
            d[i] = distance;
        }

        int optimal = m[0];
        int optimalIndex = 0;
        for(int i = 1;i<d.length;i++){
            if(optimal > m[i]){
                optimal = m[i];
                optimalIndex = i;
            }
        }
        return optimalIndex;
    }

    private static int max(int a[]){
        int max = a[0];
        for(int m : a){
            if(max < m) max = m;
        }
        return max;
    }
    private static int findForward(List<Map<String, Boolean>> blocks, int i, String req) {
        if(i >= blocks.size()) return Integer.MAX_VALUE;
        int d = 1;
        for(int j = i; j < blocks.size(); j++){
            if(blocks.get(j).get(req)){
                return d;
            }
            d++;
        }
        return Integer.MAX_VALUE;
    }

    private static int findBackward(List<Map<String, Boolean>> blocks, int i, String req) {
        if(i < 0) return Integer.MAX_VALUE;
        int d = 1;
        for(int j = i; j >= 0; j--){
            if(blocks.get(j).get(req)){
                return d;
            }
            d++;
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String args[]) {
        t1();
    }

    private static void t1(){
        String[] reqs = {"gym","school","store"};
        List<Map<String,Boolean>> list = new ArrayList<>();
        Map<String,Boolean> map = new HashMap<>();
        map.put("gym",false);
        map.put("school",true);
        map.put("store",false);
        list.add(map);

        map = new HashMap<>();
        map.put("gym",true);
        map.put("school",false);
        map.put("store",false);
        list.add(map);

        map = new HashMap<>();
        map.put("gym",true);
        map.put("school",true);
        map.put("store",false);
        list.add(map);

        map = new HashMap<>();
        map.put("gym",false);
        map.put("school",true);
        map.put("store",false);
        list.add(map);

        map = new HashMap<>();
        map.put("gym",false);
        map.put("school",true);
        map.put("store",true);
        list.add(map);

        System.out.println(apartmentHunting(list,reqs));
    }

}
