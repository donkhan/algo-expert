package algo;

public class BinarySearch {
    public static int binarySearch(int[] a, int target) {
        // Write your code here.
        int low = 0;
        int high = a.length;
        int prevmid = -1;
        while(low < high){
            int mid = (low + high) / 2;
            if(mid == prevmid) break;
            if(a[mid] == target) return mid;
            if(a[mid] > target) high = mid;
            if(a[mid] < target) low = mid;
        }
        return -1;
    }

    public  static  void main(String args[]){
        //int array[] = { 0,1,21,33,45,61,71,72,73};
        int array[] = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int pos = binarySearch(array,0);
        System.out.println(pos);
    }
}
