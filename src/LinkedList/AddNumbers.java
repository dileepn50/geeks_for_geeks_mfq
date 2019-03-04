package LinkedList;

public class AddNumbers {
    Node head1, head2, result, curr;

    void addingNumbersHelper() {
        if (head1 == null) {
            result = head1;
            return;
        }
        if (head2 == null) {
            result = head2;
            return;
        }
        int size1 = getSize(head1);
        int size2 = getSize(head2);

        if (size1 == size2) {
            addSameSize(head1, head2);
            if (carry != 0)
                push(carry, 3);
        }
        else {

            if (size1 < size2) {
                Node temp = head2;
                head2 = head1;
                head1 = temp;
            }
            int diff = Math.abs(size1 - size2);
            int count = 0;
            Node temp = head1;

            while (count++ < diff) {
                temp = temp.next;
            }
             curr = temp;
            addSameSize(curr, head2);
            Node t1 = result;
            System.out.println("current data = " + curr.data);
//            while (t1 != null) {
//                System.out.println(t1.data);
//                t1 = t1.next;
//            }
            prpogateCarry(head1);
            if (carry != 0)
                push(carry, 3);
        }
    }

    void prpogateCarry(Node node) {
        if (node == curr)
            return;

        prpogateCarry(node.next);
        int sum = node.data + carry;
        carry = sum / 10;
        sum = sum % 10;
        push(sum, 3);
    }
    int carry = 0;
    void addSameSize(Node first, Node second) {
        if (first == null && second ==null)
            return;

        addSameSize(first.next, second.next);
        int sum = first.data + second.data + carry;
        carry = sum / 10;
        sum = sum % 10;

        push(sum, 3);

    }
    static int getSize(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }


    void push(int data, int category) {
        if (category == 1) {
            Node node = new Node(data);
            node.next = head1;
            head1 = node;
        }
        else if (category == 2) {
            Node node = new Node(data);
            node.next = head2;
            head2 = node;
        }

        else {
            Node node = new Node(data);
            node.next = result;
            result = node;
        }

    }
    public static void main(String[] args) {
        AddNumbers addNumbers = new AddNumbers();

        addNumbers.push(9, 1);
        addNumbers.push(6, 1);
        addNumbers.push(5, 1);
        addNumbers.push(7, 1);
        addNumbers.push(8, 1);

        addNumbers.push(5, 2);
        addNumbers.push(4, 2);
        addNumbers.push(8, 2);

        addNumbers.addingNumbersHelper();

        Node temp = addNumbers.result;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
} 