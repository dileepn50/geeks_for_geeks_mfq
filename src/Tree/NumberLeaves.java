package Tree;

public class NumberLeaves {
    TNode root;
    int numberLeaves(TNode node) {
        if (node == null) return 0;

        if (node.left == null && node.right == null)
            return 1;

        return numberLeaves(node.left) + numberLeaves(node.right);
    }

    public static void main(String[] args) {
        NumberLeaves binaryTree = new NumberLeaves();

        TNode root = binaryTree.root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);

        root.right.left = new TNode(6);
        root.right.right = new TNode(7);
        root.left.right.left = new TNode(9);

        System.out.println("no of leaves = " + binaryTree.numberLeaves(root));
    }
} 