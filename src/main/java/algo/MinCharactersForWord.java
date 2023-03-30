package algo;

import java.util.*;

public class MinCharactersForWord {

    public char[] minimumCharactersForWords(String[] words) {
        Map<Character,Integer> global = new HashMap<>();
        for(String word : words){
            Map<Character,Integer> local = new HashMap<>();
            for(int i = 0;i<word.length();i++){
                char c = word.charAt(i);
                if(!local.containsKey(c)){
                    local.put(c,0);
                }
                local.put(c, local.get(c)+1);
            }
            Iterator<Character> iterator = local.keySet().iterator();
            while(iterator.hasNext()){
                char c = iterator.next();
                if(!global.containsKey(c)){
                    global.put(c,0);
                }
                if(global.get(c) < local.get(c)){
                    global.put(c,local.get(c));
                }
            }
        }
        Iterator<Character> iterator = global.keySet().iterator();;
        List<Character> list = new ArrayList<>();
        while(iterator.hasNext()){
            Character c = iterator.next();
            int value = global.get(c);
            for(int i = 0;i<value;i++){
                list.add(c);
            }
        }
        char[] cArray = new char[list.size()];
        for(int i = 0;i<list.size();i++) cArray[i] = list.get(i);
        return cArray;

    }

    public static void main(String args[]){
        String[] words = { "this", "that", "did", "deed","them!","a"};
        new MinCharactersForWord().minimumCharactersForWords(words);
    }

}
