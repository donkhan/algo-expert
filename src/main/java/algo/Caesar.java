package algo;

public class Caesar {

    public static void main(String args[]){
        String str = "xyz";
        int key = 2;
        String e = "";
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            int x = c - 97;
            x = (x + key) % 26;
            c = (char) (x + 97);
            e = e + c;
        }
    }

}
