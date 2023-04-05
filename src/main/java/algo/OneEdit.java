package algo;

public class OneEdit {

    public boolean oneEdit(String one, String two) {
        if(one.equals(two)) return true;
        if(Math.abs(one.length() - two.length()) >= 2) return false;
        // Replacement case
        if(one.length() == two.length()){
            int diffs = 0;
            for(int i = 0;i<one.length();i++){
                if(one.charAt(i) != two.charAt(i)) diffs++;
            }
            if(diffs == 1) return true;
        }

        if(one.length() < two.length()) {
            String t = one;
            one = two;
            two = t;
        }
        System.out.println(one + "  " + two);
        for(int i = 0;i<one.length();i++){
            String n = one.substring(0,i) + one.substring(i+1,one.length());
            if(n.equals(two)) return true;
        }
        return false;
    }

    public static void main(String args[]){
        OneEdit edit = new OneEdit();
       // System.out.println(edit.oneEdit("hello","hollo"));
        System.out.println(edit.oneEdit("abc","dc"));

    }
}
