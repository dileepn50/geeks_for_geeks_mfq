package Tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    TNode root;

    void leftView() {
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(new TNode(null));
        System.out.println(root.data);
        while (!queue.isEmpty()) {
            TNode tNode = queue.poll();
            if (tNode.data == null) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek().data);
                    queue.add(new TNode(null));
                }
            }
            else {
                if (tNode.left != null)
                    queue.add(tNode.left);
                if (tNode.right != null)
                    queue.add(tNode.right);
            }
        }
    }
    int maxLevel = 0;
    void leftViewRecursive(TNode node, int level) {
        if (node == null) return;
        if (maxLevel < level) {
            System.out.print(node.data + " ");
            maxLevel = level;
        }
        leftViewRecursive(node.left, level + 1);
        leftViewRecursive(node.right, level + 1);
    }

    public static void main(String[] args) {
        LeftView binaryTree = new LeftView();
        binaryTree.root = new TNode(10);
        binaryTree.root.left = new TNode(5);
        binaryTree.root.right = new TNode(12);
        binaryTree.root.left.right = new TNode(35);
        binaryTree.root.right.left = new TNode(21);
        binaryTree.root.right.right = new TNode(65);

        binaryTree.leftViewRecursive(binaryTree.root, 1);

    }
} 