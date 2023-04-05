package algo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SubstringProblem {

    private static Map<Character,Integer> getCharacterMap(String word){
        Map<Character,Integer> characterMap = new HashMap<>();
        for(int i = 0;i<word.length();i++){
            if(!characterMap.containsKey(word.charAt(i))){
                characterMap.put(word.charAt(i),0);
            }
            characterMap.put(word.charAt(i), characterMap.get(word.charAt(i)) + 1);
        }
        return characterMap;
    }

    public static String smallestSubstringContaining(String b, String s) {
        // Write your code here.
        String smallestSubString = "";
        for(int i = 0;i<=b.length();i++){
            for(int j = i;j<=b.length();j++){
                String ss = b.substring(i,j);
               // System.out.println(ss);

                Map<Character,Integer> c1 = getCharacterMap(ss);
                Map<Character,Integer> b1 = getCharacterMap(s);
                Iterator<Character> iterator = b1.keySet().iterator();
                boolean flag = true;
                while(iterator.hasNext()){
                    Character c = iterator.next();
                    if(c1.get(c) == null || b1.get(c) > c1.get(c)){
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    if(smallestSubString == "") smallestSubString = ss;
                    if(ss.length() < smallestSubString.length()) smallestSubString = ss;
                }

            }
        }
        return smallestSubString;
    }

    public static void main(String args[]){
        //System.out.println(smallestSubstringContaining("abcd$ef$axb$c$","$$abf"));
        System.out.println(smallestSubstringContaining("abzacdwejxjftghiwjtklmnopqrstuvwxyz","aajjttwwxxzz"));
    }
}
