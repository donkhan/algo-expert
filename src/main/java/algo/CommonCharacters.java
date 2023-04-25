package algo;
import java.util.*;

public class CommonCharacters {

    public boolean check(String[] strings, char c){
        boolean flag = true;
        for(int i = 0;i<strings.length;i++){
            if(strings[i].indexOf(c) == -1){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public String[] commonCharacters(String[] strings) {
        // Write your code here.
        String stg = strings[0];
        Set<Character> set = new HashSet<>();
        for(int i = 0;i<stg.length();i++){
            if(check(strings,stg.charAt(i))){
                set.add(stg.charAt(i));
            }
        }
        String r[] = new String[set.size()];
        int i = 0;
        for(Character c : set){
            r[i] = "" + c;
        }
        return r;
    }

    public static void main(String args[]){
        String[] s = new CommonCharacters().commonCharacters(new String[]{"abc","bcd","cbad"});
        for(String x : s){
            System.out.println(x);
        }
    }

}
