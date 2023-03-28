package algo;

public class RunLengthEncoding {

    public static void main(String args[]){
        //solve("AAAAAAAAAAAAABBCCCCDD");
        System.out.println(solve("aA"));
    }

    private static String getEncodedString(String tmp){
        String x = "";
        int l = tmp.length();
        while(l > 9){
            x = x + "9" + tmp.charAt(0);
            l = l - 9;
        }
        x = x + l + tmp.charAt(0);
        return x;
    }

    public static String solve(String input){
        String output = "";
        char c = input.charAt(0);
        int i = 1;
        String tmp = "" + c;
        while(i < input.length()){
            if(input.charAt(i) == c){
                tmp = tmp + c;
            }else{
                output = output + getEncodedString(tmp);
                c = input.charAt(i);
                tmp = "" + c;
            }
            i++;
        }
        output = output + getEncodedString(tmp);
        return output;
    }
}
