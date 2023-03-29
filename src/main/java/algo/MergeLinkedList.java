package algo;

import java.util.*;

public class MergeLinkedList {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList mergingLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList t1 = linkedListOne;
        while(t1 != null){
            LinkedList t2 = linkedListTwo;
            while(t2 != null){
                if(t1 == t2) return t1;
                t2 = t2.next;
            }
            t1 = t1.next;
        }
        return null;
    }

    public static void main(String args[]){
        MergeLinkedList mll = new MergeLinkedList();
        LinkedList l1 = new LinkedList(2);
        LinkedList l2 = new LinkedList(3);
        LinkedList l3 = new LinkedList(1);
        LinkedList l4 = new LinkedList(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        LinkedList l21 = new LinkedList(8);
        LinkedList l22 = new LinkedList(7);
        l21.next = l22;
        l22.next = l3;


        System.out.println(mll.mergingLinkedLists(l1,l21).value);
    }
}
