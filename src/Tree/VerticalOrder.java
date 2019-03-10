package Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class VerticalOrder {
    TNode root;
    HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
    void verticalOrder(TNode node, int hDistance) {
        if (node == null) return;

        if (hashMap.containsKey(hDistance))
            hashMap.get(hDistance).add(node.data);
        else {
            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(node.data);
            hashMap.put(hDistance, tempList);
        }

        verticalOrder(node.left, hDistance - 1);
        verticalOrder(node.right, hDistance + 1);
    }

    public static void main(String[] args) {
        VerticalOrder binaryTree = new VerticalOrder();
         TNode root = binaryTree.root = new TNode(1);
         root.left = new TNode(2);
         root.right = new TNode(3);
         root.left.left = new TNode(4);
         root.left.right = new TNode(5);

         root.right.left = new TNode(6);
         root.right.right = new TNode(7);
         root.right.right.left = new TNode(8);
         root.right.right.right = new TNode(9);

        binaryTree.verticalOrder(root, 0);
        System.out.println(binaryTree.hashMap);
    }
} 