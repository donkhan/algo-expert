package algo;

import java.util.*;

public class RPalindrome {

    public static boolean check(String w1, String w2){
        if(w1.length() != w2.length()) return false;
        int i = 0; int j = w2.length()-1;
        while(i < w1.length() && j >= 0){
            if(w1.charAt(i) != w2.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String args[]) {
        String[] words = {"diaper","abc","test","cba","repaid"};
        //String[] words = {"diaper","abc","repaid"};

        ArrayList<ArrayList<String>> l = new RPalindrome().semordnilap(words);
        l.stream().forEach(item -> System.out.println(item));
    }
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        ArrayList<ArrayList<String>> g = new ArrayList<>();
        for(int i = 0;i<words.length-1;i++){
            for(int j = i+1; j<words.length;j++){
                if(check(words[i],words[j])) {
                    ArrayList<String> l = new ArrayList();
                    l.add(words[i]);
                    l.add(words[j]);
                    g.add(l);
                }
            }
        }
        return g;
    }
}
