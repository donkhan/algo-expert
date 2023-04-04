package algo;

import java.util.HashSet;

public class LongestSubStringWithoutDuplicate {

    public static boolean withoutDuplicate(String s){
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0;i<s.length();i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }
        return true;
    }

    public static String longestSubstringWithoutDuplication(String str) {
        int maxLength = Integer.MIN_VALUE;
        String f = "";
        for(int i = 0;i<=str.length()-1;i++){
            for(int j = str.length();j>=i;j--){
                String sub = str.substring(i,j);
                if(j - i < maxLength) continue;
                if(withoutDuplicate(sub)){
                    //System.out.println(i + "  " + j + "  " + sub);
                    f = sub;
                    maxLength = j - i;
                }
            }
        }
        return f;
    }

    public  static  void  main(String args[]){
       System.out.println(longestSubstringWithoutDuplication("clementisacap"));
       System.out.println(longestSubstringWithoutDuplication("a"));
    }
}
