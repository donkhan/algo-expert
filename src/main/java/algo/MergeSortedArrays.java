package algo;
import java.util.*;

public class MergeSortedArrays {
    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
        int indices[] = new int[arrays.size()];
        for(int i = 0;i<indices.length;i++){
            int index = indices[i];
            List<Integer> localList = new ArrayList<>();
            if(index == -1) continue;
            localList.add(arrays.get(i).get(index));
            //9739494902

        }
        return new ArrayList<Integer>();
    }
}
