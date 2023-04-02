package algo;

public class ReverseWords {

    public void justReverse(char[] s, int i, int j){
        while(i < j){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }
    public void reverse(char[] s, int i, int j){
        i = 0;
        int st = 0;
        while(i < j){
            if(s[i] == ' ') {
                justReverse(s,st,i-1);
                while(s[i] == ' '){
                    i++;
                }
                st = i;
            }
            i++;
        }
        justReverse(s,st,s.length-1);
    }
    public String reverseWordsInString(String string) {
        char[] letters = string.toCharArray();
        justReverse(letters,0, letters.length-1);
        reverse(letters,0,letters.length-1);
        String r = "";
        for(char c : letters) r = r + c;
        return r;

    }
    public static void main(String args[]){
        System.out.println(new ReverseWords().reverseWordsInString("AlgoExpert is the best!"));
    }
}
