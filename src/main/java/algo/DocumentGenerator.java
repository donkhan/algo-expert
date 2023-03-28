package algo;
import java.util.*;

public class DocumentGenerator {

    public static void  main(String args[]){
        boolean flag = new DocumentGenerator().generateDocument("Bste!hetsi ogEAxpelrt x ","AlgoExpert is the Best!");
        System.out.println(flag);
    }

    public  boolean generateDocument(String characters, String document) {
        // Write your code here.
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        Map<Character, Integer> m2 = new HashMap<Character, Integer>();
        for(int i = 0;i<characters.length();i++){
            char c = characters.charAt(i);
            if(m1.containsKey(c)) m1.put(c,m1.get(c) + 1);
            else m1.put(c,1);
        }
        for(int i = 0;i<document.length();i++){
            char c = document.charAt(i);
            if(m2.containsKey(c)) m2.put(c,m2.get(c) + 1);
            else m2.put(c,1);
        }
        Iterator<Character> it = m2.keySet().iterator();
        while(it.hasNext()){
            char c = it.next();
            int v2 = m2.get(c);
            int v1 = m1.get(c);
            if(!m1.containsKey(c)){
                return false;
            }

            if(v1 < v2) {
                return false;
            }
        }
        return true;
    }

}
