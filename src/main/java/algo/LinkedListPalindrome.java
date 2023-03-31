package algo;
import java.util.*;


public class LinkedListPalindrome {

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public boolean linkedListPalindrome(LinkedList head) {
        // Write your code here.
        if(head == null || head.next == null) return true;
        LinkedList tmp = head;
        while(tmp.next.next != null){
            tmp = tmp.next;
        }
        LinkedList tail = tmp.next;
        System.out.println(head.value + " " + tail.value);
        if(tail.value != head.value) return false;
        tmp.next = null;
        head = head.next;
        return linkedListPalindrome(head);
    }

    public void print(LinkedList head){
        LinkedList tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    public static void main(String args[]){
        LinkedList n0 = new LinkedList(0);
        LinkedList n1 = new LinkedList(1);
        LinkedList n2 = new LinkedList(3);
        LinkedList n3 = new LinkedList(2);
        LinkedList n4 = new LinkedList(1);
        LinkedList n5 = new LinkedList(0);

        //LinkedList n5 = new LinkedList(5);
        n0.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        LinkedListPalindrome ns = new LinkedListPalindrome();
        System.out.println(ns.linkedListPalindrome(n0));



    }

}
