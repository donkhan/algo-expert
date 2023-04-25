package algo;
import java.util.*;

public class PhoneMnemonic {

    private ArrayList<String> getCharList(char c){
        ArrayList<String> list = new ArrayList<>();
        if(c == '1'){
            list.add("1");
        }
        if(c == '0'){
            list.add("0");

        }
        if(c == '2'){
            list.add("a");list.add("b");list.add("c");
        }
        if(c == '3'){
            list.add("d");list.add("e");list.add("f");
        }
        if(c == '4'){
            list.add("g");list.add("h");list.add("i");
        }
        if(c == '5'){
            list.add("j");list.add("k");list.add("l");
        }
        if(c == '6'){
            list.add("m");list.add("n");list.add("o");
        }
        if(c == '7'){
            list.add("p");list.add("q");list.add("r");list.add("s");
        }
        if(c == '8'){
            list.add("t");list.add("u");list.add("v");
        }
        if(c == '9'){
            list.add("w");list.add("x");list.add("y");list.add("z");
        }
        return list;
    }
    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        // Write your code here.
        ArrayList<String> list = new ArrayList<String>();
        if(phoneNumber.length() == 0){
            return list;
        }
        char c = phoneNumber.charAt(0);
        ArrayList<String> cList = getCharList(c);
        ArrayList<String> rList = phoneNumberMnemonics(phoneNumber.substring(1));
        for(String s: cList){
            for(String r: rList){
                list.add(s + r);
            }
        }
        if(list.size() == 0){
            return cList;
        }
        return list;
    }

    public static void main(String args[]){
        ArrayList<String> list = new PhoneMnemonic().phoneNumberMnemonics("1905");
        for(String s: list){
            System.out.println(s);
        }
    }
}
