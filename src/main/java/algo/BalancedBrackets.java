package algo;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String args[]) {
        //System.out.println(balancedBrackets("([])(){}(())()()"));
        System.out.println(balancedBrackets(")[]}"));
    }

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            }
            if (c == ']' || c == ')' || c == '}') {
                if(stack.isEmpty()) return false;
                char p = stack.pop();
                if (p == '[' && c != ']') return false;
                if (p == '{' && c != '}') return false;
                if (p == '(' && c != ')') return false;
            }
        }
        return stack.isEmpty();
    }
}
