package algo;

public class ZipLinkedList {

    public static class LinkedList {
        public int value;
        LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }

        public String toString(){
            return "" + value;
        }
    }

    public void print(LinkedList head){
        LinkedList tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    private void detachAndAttach(LinkedList head){
        LinkedList tmp = head;
        if(tmp.next == null || tmp.next.next == null) return;
        while(tmp.next.next != null){
            tmp = tmp.next;
        }
        LinkedList tail = tmp.next;
        tail.next = head.next;
        head.next = tail;
        tmp.next = null;
    }
    private LinkedList zip(LinkedList head){
        if(head.next == null) return head;
        LinkedList tmp = head;
        while(tmp != null) {
            detachAndAttach(tmp);
            if(tmp.next == null) break;
            tmp = tmp.next.next;
        }
        return head;
    }

    public static void main(String args[]){
        LinkedList n1 = new LinkedList(1);
        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(3);
        LinkedList n4 = new LinkedList(4);
        LinkedList n5 = new LinkedList(5);
        LinkedList n6 = new LinkedList(6);
        n1.next = n2; //n2.next = n3; n3.next = n4; n4.next = n5;n5.next = n6;
        ZipLinkedList zip = new ZipLinkedList();
        zip.print(n1);
        zip.zip(n1);
        zip.print(n1);
    }
}
