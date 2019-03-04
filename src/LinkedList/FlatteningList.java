package LinkedList;

public class FlatteningList {
    FNode head;

    void push(int data) {
        if (head == null)
            head = new FNode(data);
        else {
            FNode temp = head;
            while (temp.right != null)
                temp = temp.right;
            temp.right = new FNode(data);
        }
    }

    public static void main(String[] args) {
        FlatteningList linkedList = new FlatteningList();
        linkedList.push(5);
        linkedList.push(10);
        linkedList.push(19);
        linkedList.push(28);

        FNode first = linkedList.head;
        FNode second = linkedList.head.right;
        FNode third = linkedList.head.right.right;
        FNode fourth = linkedList.head.right.right.right;

        first.down = new FNode(7);
        first.down.down = new FNode(8);
        first.down.down.down = new FNode(30);

        second.down = new FNode(20);

        third.down = new FNode(22);
        third.down.down = new FNode(50);

        fourth.down = new FNode(35);
        fourth.down.down = new FNode(40);
        fourth.down.down.down = new FNode(45);

        FNode temp = linkedList.head;
        FNode result = null;

        while (temp != null) {
            result = sortedMerge(result, temp);
            temp = temp.right;
        }

        while (result != null) {
            System.out.println(result.data);
            result = result.down;
        }


    }

    static FNode sortedMerge(FNode first, FNode second) {
        if (first == null)
            return second;
        if (second == null)
            return first;
        FNode result;
        if (first.data <= second.data) {
             result = first;
            result.down = sortedMerge(first.down, second);
        }
        else {
            result = second;
            result.down = sortedMerge(first, second.down);
        }
        return result;
    }
} 