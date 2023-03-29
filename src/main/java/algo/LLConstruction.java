package algo;

import java.util.*;

// Feel free to add new properties and methods to the class.
public class LLConstruction {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        private boolean isPresent(Node node) {
            Node tmp = head;
            while(tmp != null){
                if(tmp == node) return true;
                tmp = tmp.next;
            }
            return false;
        }

        public void setHead(Node node) {
            remove(node);
            if(head == null){
                head = node;
                tail = node;
                return;
            }
            node.prev = null;
            head.prev = node;
            node.next = head;
            head = node;
        }

        public void setTail(Node node) {
            remove(node);
            if(tail == null){
                head = node;
                tail = node;
                return;
            }
            node.next = null;
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            remove(nodeToInsert);
            if(node == head){
                setHead(nodeToInsert);
                return;
            }
            nodeToInsert.prev = node.prev;
            node.prev.next = nodeToInsert;
            nodeToInsert.next = node;
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            remove(nodeToInsert);
            if(node == tail){
                setTail(nodeToInsert);
                return;
            }
            nodeToInsert.next = node.next;
            node.next.prev = nodeToInsert;
            nodeToInsert.prev = node;
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            remove(nodeToInsert);
            Node tmp = head;
            int i = 1;
            if(head == null && position == 1){
                setHead(nodeToInsert);
                return;
            }
            while(tmp != null && i <= position){
                if(i == position) {
                    insertBefore(tmp,nodeToInsert);
                    break;
                }
                tmp = tmp.next;
                i = i + 1;
            }
        }

        public void removeNodesWithValue(int value) {
            forward();
            Node tmp = head;
            while(tmp != null){
                if(tmp.value == value) {
                    Node t = tmp.next;
                    remove(tmp);
                    tmp = t;
                    continue;
                }
                tmp = tmp.next;
            }
        }

        public void remove(Node node) {
            // Write your code here.
            if(!isPresent(node)){
                return;
            }
            if(node == head){
                head = head.next;
                if(head != null)
                    head.prev = null;
                return;
            }
            if(node == tail){
                tail = tail.prev;
                if(tail != null)
                    tail.next = null;
                return;
            }

            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {
            Node tmp = head;
            while(tmp != null){
                if(tmp.value == value) return true;
                tmp = tmp.next;
            }
            return false;
        }


        public void forward(){
            forward(head);
            System.out.println(" ");
        }
        public void forward(Node n){
            if(n == null) return;
            System.out.print(n.value + "  ");
            forward(n.next);
        }

        public void backward(){
            backward(tail);
            System.out.println(" ");
        }
        public void backward(Node n){
            if(n == null) return;
            System.out.print(n.value + "  ");
            backward(n.prev);
        }

    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public String toString(){
            return value + "  " + hashCode();
        }
    }

    static DoublyLinkedList dd = new DoublyLinkedList();

    public static void main(String args[]) {
        t1();

    }

    private static void t15() {
        Node n1 = new Node(1);
        dd.setHead(n1);
        dd.forward();
        dd.remove(n1);
        dd.forward();
    }

    private static void t14() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        dd.setHead(n1);
        dd.insertAfter(n1, n2);

        dd.insertAfter(n2, n3);
        dd.insertAfter(n3, n4);
        dd.insertAfter(n4, n5);
        dd.insertAfter(n5, n6);
        dd.insertAfter(n6, n7);
        dd.forward();

        dd.insertAtPosition(7, n1);
        //dd.insertAtPosition(1, n1);
        dd.forward();

        //dd.insertAtPosition(2,n1);
    }

    private static void t11() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.setHead(n1);
        dd.insertAfter(n1,n2);
        dd.insertAfter(n2,n3);
        dd.insertAfter(n3,n4);
        dd.setTail(n1);
        dd.forward();

    }

    private static void t2(){
        Node n1 = new Node(1);
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.insertAtPosition(1,n1);
        dd.forward();
    }

    private static void t1(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n32 = new Node(3);
        Node n33 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        DoublyLinkedList dd = new DoublyLinkedList();
        dd.setHead(n5);
        dd.setHead(n4);
        dd.setHead(n3);
        dd.setHead(n2);
        dd.setHead(n1);
        dd.setHead(n4);
        dd.setTail(n6);


        dd.insertBefore(n6, n3);
        dd.insertAfter(n6, n32);

        dd.removeNodesWithValue(3);

        dd.remove(n2);
        dd.containsNodeWithValue(5);
        dd.forward();
    }
}
