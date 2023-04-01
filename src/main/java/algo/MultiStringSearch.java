package algo;
import java.util.*;

public class MultiStringSearch {


        public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
            List result = new ArrayList<Boolean>();
            for(String s : smallStrings){
                boolean found = false;
                for(int i = 0;i<bigString.length();i++){
                    if(i + s.length() > bigString.length()) continue;
                    String x = bigString.substring(i,i+s.length());
                    if(x.equals(s)){
                        found = true;
                        break;
                    }
                }
                result.add(found);
            }
            return result;
        }


        public  static  void main(String args[]){
            //List<Boolean> l = multiStringSearch("abcdefghijklmnopqrstuvwxyz",
              //      new String[]{"abc","mnopqr","wyz","no","e","tuuv"});
            List<Boolean> l = multiStringSearch("bbbabb",
                    new String[]{"bbabb"});
            for(Boolean bool : l){
                System.out.print(bool + ",");
            }
        }

}
