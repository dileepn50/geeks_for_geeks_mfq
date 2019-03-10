package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeMirror {
    TNode root1, root2;

    boolean checkMirror(TNode node1, TNode node2) {
        if (node1 == null && node2 ==null) return true;
        List<Integer> list = new ArrayList<>();
        if (node1 == null) return false;
        if (node2 == null) return false;

        return (node1.data.equals(node2.data)) && checkMirror(node1.left, node2.right) && checkMirror(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeMirror binaryTree = new TreeMirror();

        binaryTree.root1 = new TNode(1);
        binaryTree.root1.left = new TNode(2);
        binaryTree.root1.right = new TNode(3);
        binaryTree.root1.left.left = new TNode(4);
        binaryTree.root1.left.right = new TNode(5);
        binaryTree.root1.right.left = new TNode(6);

        binaryTree.root2 = new TNode(1);
        binaryTree.root2.left = new TNode(3);
        binaryTree.root2.right = new TNode(2);
        binaryTree.root2.left.right = new TNode(6);
        binaryTree.root2.right.left = new TNode(5);
        binaryTree.root2.right.right = new TNode(4);

        System.out.println(binaryTree.checkMirror(binaryTree.root1, binaryTree.root2));

    }
} 