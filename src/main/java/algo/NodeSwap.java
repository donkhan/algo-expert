package algo;
import java.util.*;


public class NodeSwap {

        // This is an input class. Do not edit.
        public static class LinkedList {
            public int value;
            public LinkedList next;

            public LinkedList(int value) {
                this.value = value;
                this.next = null;
            }
        }

        public LinkedList nodeSwap(LinkedList head) {
            LinkedList tmp = head;
            while(tmp != null){
                if(tmp.next != null){
                    int t = tmp.value;
                    tmp.value = tmp.next.value;
                    tmp.next.value = t;
                }

                tmp = tmp.next;
                if(tmp != null) tmp = tmp.next;
            }
            return head;
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
            LinkedList n2 = new LinkedList(2);
            LinkedList n3 = new LinkedList(3);
            LinkedList n4 = new LinkedList(4);
            //LinkedList n5 = new LinkedList(5);
            n0.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; //n4.next = n5;
            NodeSwap ns = new NodeSwap();
            ns.print(n0);
            ns.nodeSwap(n0);
            ns.print(n0);
        }

}
