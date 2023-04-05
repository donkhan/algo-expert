package algo;

public class ShiftedBinarySearch {
    public static int shiftedBinarySearch(int[] a, int target) {
        // Write your code here.
        int i = 0;
        while(i < a.length-1 && a[i] < a[i+1]){
            i++;
        }
        i = i + 1;
        int u[] = new int[i];
        for(int j = 0;j<u.length;j++){
            u[j] = a[j];
        }
        int l[] = new int[a.length-i];
        for(int j = i,k=0;j<a.length;j++,k++){
            l[k] = a[j];
        }
        int f1 = binarySearch(u,target);
        int f2 = binarySearch(l,target);
        if(f1 == -1 && f2 == -1) return -1;
        if(f1 != -1) return f1;
        return f2;
    }

    public static int binarySearch(int[] a, int target) {
        // Write your code here.
        int low = 0;
        int high = a.length;
        int pmid = -1;
        while(low < high){
            int mid = (low + high) / 2;
            if(pmid == mid) break;
            pmid = mid;
            if(a[mid] == target) return mid;
            if(a[mid] > target) high = mid;
            if(a[mid] < target) low = mid;
        }
        return -1;
    }

    public static void main(String args[]) {
        t3();
    }
    private static void t1(){
        System.out.println(shiftedBinarySearch(new int[]{45, 61, 71, 72, 73, 0, 1, 21, 33, 37},33));
    }

    private static void t2(){
        System.out.println(shiftedBinarySearch(new int[]{5, 23, 111, 1},111));
    }

    private static void t3(){
        System.out.println(shiftedBinarySearch(new int[]{111,1,5,23},5));
    }
}
