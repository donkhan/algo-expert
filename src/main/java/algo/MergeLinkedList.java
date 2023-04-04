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

    public LinkedList mergingLinkedLists(LinkedList t1, LinkedList t2) {
        LinkedList head = null;
        if(t1 == null && t2 == null){
            return head;
        }
        if(t1 == null){
            head = t2;
            head.next = mergingLinkedLists(t1,t2.next);
            return head;
        }
        if(t2 == null){
            head = t1;
            head.next = mergingLinkedLists(t1.next,t2);
            return head;
        }
        if(t1.value < t2.value){
            head = t1;
            head.next = mergingLinkedLists(t1.next,t2);
        }
        else {
            head = t2;
            head.next = mergingLinkedLists(t1,t2.next);
        }
        return head;

    }

    public void traverse(LinkedList head){
        LinkedList tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        MergeLinkedList mll = new MergeLinkedList();
        LinkedList l2 = new LinkedList(2);
        LinkedList l6 = new LinkedList(6);
        LinkedList l7 = new LinkedList(7);
        LinkedList l8 = new LinkedList(8);
        l2.next = l6; l6.next = l7; l7.next = l8;
        mll.traverse(l2);

        LinkedList l1 = new LinkedList(1);
        LinkedList l3 = new LinkedList(3);
        LinkedList l4 = new LinkedList(4);
        LinkedList l5 = new LinkedList(5);
        LinkedList l9 = new LinkedList(9);
        LinkedList l10 = new LinkedList(10);
        l1.next = l3; l3.next  = l4; l4.next = l5; l5.next = l9;l9.next = l10;

        mll.traverse(l1);;
        mll.traverse(mll.mergingLinkedLists(l1,l2));
    }
}
