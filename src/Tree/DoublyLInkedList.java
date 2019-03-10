package Tree;

public class DoublyLInkedList {
    DNode head;

    void push(int item) {
        if (this.head == null)
            this.head = new DNode(item);
        else {

            DNode dNode = new DNode(item);
            dNode.next = head;
            head.prev = dNode;
            this.head = dNode;
        }
    }

    void pushEnd(int item) {
        if (this.head == null)
            this.head = new DNode(item);

        else {
            DNode temp = this.head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = new DNode(item);
            temp.next.prev = temp;
        }

    }

    void pushPos(int item, int pos) {
        DNode temp = this.head;
        int i = 1;

        while (temp != null && i < pos -1) {
            temp = temp.next;
            i++;
        }

        if (i == pos - 1) {
            DNode next = temp.next;
            DNode dNode = new DNode(item);
            dNode.next = next;
            temp.next = dNode;
            next.prev = dNode;
            dNode.prev = temp;
        }
        else
            System.out.println("position is more than the size of list ");

    }

    void deletePos(int pos) {
        DNode temp = this.head;

        int i = 1;
        while (temp != null && i < pos) {
            i++;
            temp = temp.next;
        }
        DNode next = temp.next;
        DNode prev = temp.prev;
        prev.next = next;
        next.prev = prev;
    }

    public static void main(String[] args) {
        DoublyLInkedList doublyLInkedList = new DoublyLInkedList();
        doublyLInkedList.push(56);
        doublyLInkedList.push(23);
        doublyLInkedList.push(45);
        doublyLInkedList.pushEnd(12);
        doublyLInkedList.pushPos(5, 2);

//        System.out.println(doublyLInkedList.head.prev.data);
        DNode temp = doublyLInkedList.head;

        doublyLInkedList.deletePos(3);
        while (temp != null) {
            System.out.println(temp.data); temp = temp.next;
        }

    }
} 