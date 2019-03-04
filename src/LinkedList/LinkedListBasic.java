package LinkedList;

public class LinkedListBasic {
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

    void printList() {
         Node current = head;
         while (current != null) {
             System.out.println(current.data);
             current = current.next;
         }

    }

    Node printMIddle() {
        if (head == null) {
            System.out.println("data not present");
            return head;
        }
        if (head.next == null) {
            System.out.println("middle element is " + head.data);
            return head;
        }
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    void reverseList() {
        System.out.println("list reversal in progress");
         if (head == null) {
             System.out.println("list is empty ");
             return;
         }
         if (head.next == null) {
             System.out.println("list reversal is done");
             return;
         }
         Node prev = null;
         Node current = head;
         Node next = current.next;

         while (next != null) {
             current.next = prev;
             prev = current;
             current = next;
             next = next.next;
         }
         current.next = prev;
        System.out.println("list after reversing ");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    void rotateList(int k) {
         Node current = head;
         int count = 1;
         Node kthNode = null;
         while (current.next != null) {
             current = current.next;
             count++;
             if (count == k)
                kthNode = current;
         }
         if (kthNode == null) {
             System.out.println("value of k is greater than size of list ");
             return;
         }

         Node last = current;
         last.next = head;
         head = kthNode.next;
         kthNode.next = null;
    }

    Node reverseInGroups(Node head, int k) {
         Node prev = null;
         Node current = head;
         Node next = current.next;
         int count = 0;

         while (count < k && current.next!= null) {
             current.next = prev;
             prev = current;
             current = next;
             next = next.next;
             count++;
         }
         if (current.next != null)
             head.next = reverseInGroups(current, 3);
         else {
             current.next = prev;
             head.next = null;
             return current;
         }
         return prev;
    }

    static boolean removeLoop(Node ptr1, Node ptr2) {
         while (true) {
             Node current = ptr2;
             while (current.next != ptr2 && current.next != ptr1)
                 current = current.next;

             if (current.next == ptr1) {
                 current.next = null;
                 break;
             }
             ptr1 = ptr1.next;
         }
         return true;
    }



    static boolean detectLoopAndRemove(Node head) {
         Node current = head;
         if (current == null || current.next == null) {
             System.out.println("no loop");
             return false;
         }
         Node slow = current;
         Node fast = current;

         boolean loopRemoved = false;
         while (fast.next != null && fast.next.next != null) {
             slow = slow.next;
             fast = fast.next.next;
             if (slow == fast) {
                 System.out.println("loop is present ");
                  if (removeLoop(head, slow)) {
                      loopRemoved = true;
                      System.out.println("loop is removed");

                  }
             }
         }
        return loopRemoved;

    }

    public static void main(String[] args) {
        LinkedListBasic linkedList = new LinkedListBasic();
        linkedList.push(10);
        linkedList.push(21);
        linkedList.push(5);
        linkedList.push(34);
        linkedList.push(54);
        linkedList.push(42);
        linkedList.push(56);
        linkedList.push(67);
        linkedList.push(32);

        linkedList.printMIddle();



//
//        linkedList.printList();
//        linkedList.printMIddle();
//        linkedList.reverseList();
//        linkedList.rotateList(12);
//
//        Node start = linkedList.reverseInGroups(linkedList.head, 3);
//        Node current = start;
//
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }
//
//
    }
}