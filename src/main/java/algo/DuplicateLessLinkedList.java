package algo;

import java.util.*;

public class DuplicateLessLinkedList {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList root) {
        // Write your code here.
        LinkedList tmp = root;
        while(tmp.next != null) {
            if (tmp.value == tmp.next.value) {
                tmp.next = tmp.next.next;
                continue;
            }
            tmp = tmp.next;
        }
        return root;
    }

    public void iterate(LinkedList root){
        LinkedList tmp = root;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
    }

    public static void main(String args[]){
        LinkedList root = new LinkedList(1);
        LinkedList n1 = new LinkedList(1);
        root.next = n1;
        LinkedList n3 = new LinkedList(3);
        n1.next = n3;
        LinkedList n41 = new LinkedList(4);
        n3.next = n41;
        LinkedList n42 = new LinkedList(4);
        n41.next = n42;
        LinkedList n43 = new LinkedList(4);
        n42.next = n43;
        LinkedList n5 = new LinkedList(5);
        n43.next = n5;
        LinkedList n6 = new LinkedList(6);
        n5.next = n6;
        LinkedList n61 = new LinkedList(6);
        n6.next = n61;
        DuplicateLessLinkedList dll = new DuplicateLessLinkedList();
        dll.removeDuplicatesFromLinkedList(root);
        dll.iterate(root);
    }
}
