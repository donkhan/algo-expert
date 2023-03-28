package algo;
import java.util.*;

public class ValidSequence {

    public static void main(String args[]) {
        test_1();
    }

    public static void solve(Integer s[], Integer a[]){
        List<Integer> array = new ArrayList<>();
        Collections.addAll(array, a);
        List<Integer> sequence = new ArrayList<>();
        Collections.addAll(sequence, s);
        System.out.println(isValidSubsequence(sequence,array));
    }

    public static void test_1(){
        solve(new Integer[]{5,1,22,25,6,-1,8,10},new Integer[]{1,6,-1,10});
    }



    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int i = 0;
        int start = 0;
        int found = 0;
        while(i < sequence.size()){
            for(int j = start;j <array.size();j++){
                if(j >= array.size()){
                    return false;
                }
                if(sequence.get(i) == array.get(j)){
                    System.out.println("Found " + sequence.get(i));
                    found++;
                    start = j + 1;
                    break;
                }
            }
            i++;
        }
        return found == sequence.size();
    }
}
