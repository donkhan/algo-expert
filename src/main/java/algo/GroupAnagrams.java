package algo;
import java.util.*;

public class GroupAnagrams {

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

    public static List<String> getAnagrams(List<String> words, String word){
        List<String> r = new ArrayList<>();
        Map<Character,Integer> characterMap =  getCharacterMap(word);
        for(int j = 0;j<words.size();j++){
            String checkWord = words.get(j);
            if(word.length() != checkWord.length()) continue;
            Map<Character,Integer> cMap = getCharacterMap(checkWord);
            Iterator<Character> iterator = characterMap.keySet().iterator();
            boolean flag = true;
            while(iterator.hasNext()){
                Character c = iterator.next();
                if(characterMap.get(c) != cMap.get(c)){
                    flag = false;
                }
            }
            if(flag){
                r.add(checkWord);
            }
        }
        return r;
    }

    private static boolean isPresent(List<List<String>> anagrams,String word){
        boolean found = false;
        for(List<String> l : anagrams) {
            for (String s : l) {
                if(s == word) found = true;
            }
        }
        return found;

    }
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        List<List<String>> anagrams = new ArrayList<>();
        for(int i = 0;i<=words.size()-1;i++){
            List<String> anagram = new ArrayList<>();
            String word = words.get(i);
            if(isPresent(anagrams,word)){
                continue;
            }
            List<String> ana = getAnagrams(words,word);
            anagrams.add(ana);
        }
        return anagrams;
    }

    public static void main(String args[]){
        List<String> words = new ArrayList<>();
        //words.add("yo");words.add("act"); words.add("flop");words.add("tac");words.add("foo");
        //words.add("cat"); words.add("oy"); words.add("olfp");
        //words.add("test");
        words.add("bob"); words.add("boo");
        List<List<String>> list = groupAnagrams(words);
        for(List<String> l : list){
            for(String s : l){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
