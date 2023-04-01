package algo;

public class ReverseLinkedList {

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }


    //already solved problem in the academia. relearnt it.
    public static LinkedList reverseLinkedList(LinkedList head) {
        if(head.next == null) return head;
        LinkedList prev = null;
        LinkedList current = head;
        LinkedList next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public void print(LinkedList head){
        LinkedList tmp = head;
        while(tmp != null){
            System.out.print(tmp.value);
            if(tmp.next != null)System.out.print("->");
            tmp = tmp.next;
        }
    }

    public  static  void main(String args[]){

        LinkedList n1 = new LinkedList(1);
        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(3);
        n1.next = n2; n2.next = n3;

        new ReverseLinkedList().print(n1);
        System.out.println();
        LinkedList nhead = reverseLinkedList(n1);
        new ReverseLinkedList().print(nhead);
    }
}
