package algo;

public class SearchForRange {


    public static int[] searchForRange(int[] a, int target) {
        // Write your code here.
        int x[] = {-1, -1};
        int prevmid = -1;
        int low = 0;
        int high = a.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (mid == prevmid) break;
            prevmid = mid;
            if (a[mid] == target) {
                x[0] = mid;
                x[1] = mid;
                int pos = mid;
                while (pos >= 0 && a[pos] == target) {
                    x[0] = pos;
                    pos--;
                }
                pos = mid;
                while (pos < a.length && a[pos] == target) {
                    x[1] = pos;
                    pos++;
                }
                return x;
            }
            if (a[mid] > target) high = mid;
            if (a[mid] < target) low = mid;
        }
        return x;
    }


    public static void main(String args[]) {
       /* t1();
        t2();
        t3();
        t4();
        t5();*/
        t6();
        //t7();
        //t8();
        //t9();
    }

    private static void t4() {
        int[] pos = searchForRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t5() {
        int[] pos = searchForRange(new int[]{5, 7, 7, 8, 8, 10}, 10);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t6() {
        int[] pos = searchForRange(new int[]{5, 7, 7, 8, 8, 10}, 9);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t7() {
        int[] pos = searchForRange(new int[]{0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73}, 47);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t8() {
        int[] pos = searchForRange(new int[]{0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 7}, -1);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t9() {
        int[] pos = searchForRange(new int[]{0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 45, 45, 45}, 45);
        System.out.println(pos[0] + " " + pos[1]);
    }
    private static void t1() {
        int[] pos = searchForRange(new int[]{0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73}, 45);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t2() {
        int[] pos = searchForRange(new int[]{5, 7, 7, 8, 8, 1}, 5);
        System.out.println(pos[0] + " " + pos[1]);
    }

    private static void t3() {
        int[] pos = searchForRange(new int[]{5, 7, 7, 8, 8, 1}, 7);
        System.out.println(pos[0] + " " + pos[1]);
    }
}



