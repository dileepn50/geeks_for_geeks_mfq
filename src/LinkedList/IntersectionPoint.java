package LinkedList;

import java.util.HashMap;

public class IntersectionPoint {
    public static void main(String[] args) {
        Node firstNode = new Node(5);
        firstNode.next = new Node(8);
        firstNode.next.next = new Node(15);
        Node tempNode = new Node(2);
        firstNode.next.next.next = tempNode;
        tempNode.next = new Node(16);
        tempNode.next.next = new Node(13);

        Node secondNode = new Node(1);
        secondNode.next = new Node(12);
        secondNode.next.next = tempNode;

        HashMap<Node, Integer> hashMap = new HashMap<>();

        while (firstNode != null) {
            hashMap.put(firstNode, 1);
            firstNode = firstNode.next;
        }
        while (secondNode != null) {
            if (hashMap.containsKey(secondNode)) {
                System.out.println("intersection point is  = " + secondNode.data);
                break;
            }
            secondNode = secondNode.next;
        }
    }
}