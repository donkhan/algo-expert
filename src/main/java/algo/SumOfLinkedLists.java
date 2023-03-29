package algo;

import java.util.*;

public class SumOfLinkedLists {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public int sum(LinkedList ll){
        String value = "";
        while(ll != null){
            value =  ll.value + value;
            ll = ll.next;
        }
        return Integer.parseInt(value);
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        // Write your code here.
        int s1 = sum(linkedListOne);
        int s2 = sum(linkedListTwo);
        int s = s1 + s2;
        LinkedList root = null;
        while(s > 0){
            LinkedList newNode = new LinkedList(s % 10);
            if(root == null){
                root = newNode;
            }else{
                LinkedList tmp = root;
                while(tmp.next != null){
                    tmp = tmp.next;
                }
                tmp.next = newNode;
            }
            s = s / 10;
        }
        if(root == null) root = new LinkedList(0);
        return root;
    }

}
