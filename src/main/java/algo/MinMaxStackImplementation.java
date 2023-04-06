package algo;

import java.util.*;

public class MinMaxStackImplementation {

    // REVISIT. Need to do with two stacks
    // Feel free to add new properties and methods to the class.
    static class MinMaxStack {
        Stack<Integer> stack = new Stack();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        public int peek() {
           // Write your code here.
           if(stack.isEmpty()) return -1;
           return stack.peek();
        }

        public int pop() {
            // Write your code here.
            if(stack.isEmpty()) return -1;
            return stack.pop();
        }

        public void push(Integer number) {
            // Write your code here.
            stack.push(number);
        }

        public int getMin() {
            return stack.stream().max(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            }).get();
        }

        public int getMax() {
            // Write your code here.
            return stack.stream().max(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            }).get();
        }
    }

    public static void main(String args[]){
        MinMaxStack stack = new MinMaxStack();
        stack.push(5);
    }

}
