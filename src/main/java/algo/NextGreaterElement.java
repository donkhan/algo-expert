package algo;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] array) {
        int l = array.length;
        int o[] = new int[l];
        for(int i = 0;i<l;i++){
            int v = array[i];
            boolean found = false;
            if(!found) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > v) {
                        v = array[j];
                        found = true;
                        break;
                    }
                }
            }
            if(!found){
                for (int j = 0; j < i; j++) {
                    if (array[j] > v) {
                        v = array[j];
                        found = true;
                        break;
                    }
                }
            }
            if(found) o[i] = v;
            else o[i] = -1;
        }
        return o;
    }

    public static void main(String args[]){
        int a[] = new NextGreaterElement().nextGreaterElement(new int[]{2,5,-3,-4,6,7,2});
        for(int x : a) System.out.print(" " + x);
    }
}
