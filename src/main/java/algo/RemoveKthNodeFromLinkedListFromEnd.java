package algo;

public class RemoveKthNodeFromLinkedListFromEnd {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        int length = 0;
        LinkedList tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            length++;
        }
        k = length - k + 1;
        if(k == 1 && length == 1) return;
        if(k == 1 && length != 1){
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        tmp = head;
        k--;
        while(tmp != null && k > 1) {
            tmp = tmp.next;
            k--;
        }
       // tmp.value = tmp.next.value;
        tmp.next = tmp.next.next;

    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    public static  void main(String args[]){
        LinkedList n0 = new LinkedList(0);
        LinkedList n1 = new LinkedList(1);

        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(3);
        LinkedList n4 = new LinkedList(4);
        LinkedList n5 = new LinkedList(5);

        n0.next = n1; n1.next = n2; n2.next = n3;n3.next = n4; n4.next = n5;
        print(n0);
        RemoveKthNodeFromLinkedListFromEnd.removeKthNodeFromEnd(n0,6);
        print(n0);
    }

    private static void print(LinkedList node){
        LinkedList tmp = node;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
