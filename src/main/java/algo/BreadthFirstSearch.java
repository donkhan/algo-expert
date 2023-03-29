package algo;

import java.util.*;

public class BreadthFirstSearch {
    // Do not edit the class below except
    // for the breadthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            // Write your code here.

            Queue<Node> queue = new LinkedList<>();
            queue.add(this);

            while(!queue.isEmpty()){
                Node node = queue.remove();
                queue.addAll(node.children);
                //node.children.stream().forEach(e -> array.add(e.name));
                array.add(node.name);
            }

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void main(String args[]){
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");

        List<String> list = new ArrayList<>();
        a.addChild("B");a.addChild("C");a.addChild("D");
        a.children.get(0).addChild("E");a.children.get(0).addChild("F");

        a.breadthFirstSearch(list);
        list.stream().forEach(System.out::println);
    }
}
