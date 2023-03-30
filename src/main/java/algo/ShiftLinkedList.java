package algo;

import java.util.*;

public class ShiftLinkedList {
    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        // Write your code here.


        int size = 0;
        LinkedList tmp = head;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
        if(k > 0) {
            if (k > size) {
                k = k % size;
            }
        }else{
            if(Math.abs(k) > size){
                k = ((k*-1) % size)*-1;
            }
            k = k + size;
        }

        while(k > 0){
            forwardShift(head);
            k--;
        }

        return head;
    }

    private static void forwardShift(LinkedList head) {
        int t = head.value;
        LinkedList tmp = head.next;
        while(tmp != null){
            int x = tmp.value;
            tmp.value = t;
            t = x;
            tmp = tmp.next;
        }
        head.value = t;
    }




    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }

    }

    public static void print(LinkedList head){
        LinkedList tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + "  ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LinkedList head = new LinkedList(0);
        LinkedList n1 = new LinkedList(1);
        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(3);
        LinkedList n4 = new LinkedList(4);
        LinkedList n5 = new LinkedList(5);
        head.next = n1;n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        print(head);
        ShiftLinkedList.shiftLinkedList(head,7);
        print(head);
    }
}
