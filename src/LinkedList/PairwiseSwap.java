package LinkedList;

public class PairwiseSwap {
    Node head;

    void push(int data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(data);
        }
    }

    static Node  pairSwap(Node curr) {
        if (curr == null || curr.next == null)
            return curr;

        Node next = curr.next;
        Node newElement = next.next;
        next.next = curr;
        curr.next = pairSwap(newElement);
        return next;
    }

    public static void main(String[] args) {
        PairwiseSwap linkedList = new PairwiseSwap();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);

        Node head = pairSwap(linkedList.head);
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
} 