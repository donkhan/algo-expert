package algo;

public class LongestPalindromeSequence {

    public static String longestPalindromicSubstring(String str) {
        String longest = "";
        for(int i = 0;i<str.length();i++) {
            for (int j = 0; j < str.length(); j++) {
                int s = i;
                int e = str.length() - j;
                if(s < e) {
                    String substring = str.substring(s, e);
                    if(substring.length() > longest.length()){
                        if(isPalindrome(substring)){
                            longest = substring;
                        }
                    }
                }
            }
        }
        return longest;
    }

    private static boolean isPalindrome(String substring) {
        int s = 0;
        int e = substring.length()-1;
        while(s < e){
            if(substring.charAt(s) != substring.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(longestPalindromicSubstring("abaxyzzyxf"));
        //System.out.println(longestPalindromicSubstring("abcdef"));

    }

}
