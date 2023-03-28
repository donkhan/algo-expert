package algo;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static  void main(String args[]){
        System.out.println(new FirstNonRepeatingCharacter().firstNonRepeatingCharacter("abcd"));
    }

    public int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        if(string.length() == 1) return 0;
        for(int i = 0;i<string.length();i++){
            char c = string.charAt(i);
            boolean found = false;
            for(int j = 0;j<string.length();j++){
                if(i == j) continue;
                char d = string.charAt(j);
                if(c == d) {
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
