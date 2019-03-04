package LinkedList;

public class MergeSort {
    Node head;

    void push(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
    Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node middle = getMiddle(head);
        System.out.println("middle element is = " + middle.data);
        Node nextMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextMiddle);

        return sortMerge(left, right);
    }

    Node sortMerge(Node a, Node b) {
        Node result = null;
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            result = a;
            result.next = sortMerge(a.next, b);
        }
        else  {
            result = b;
            result.next = sortMerge(a, b.next);
        }
        return result;
    }

    Node getMiddle(Node head) {
        if (head == null) {
            System.out.println("data not present");
            return head;
        }
        if (head.next == null) {
            System.out.println("middle element is " + head.data);
            return head;
        }
        Node slowPointer = head;
        Node fastPointer = head.next;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.push(25);
        mergeSort.push(32);
        mergeSort.push(5);
        mergeSort.push(87);
        mergeSort.push(21);
        mergeSort.push(9);
        mergeSort.push(43);
        mergeSort.push(12);
        mergeSort.push(13);

        Node sortedNode = mergeSort.mergeSort(mergeSort.head);

        while (sortedNode != null) {
            System.out.println(sortedNode.data);
            sortedNode = sortedNode.next;
        }

    }
} 