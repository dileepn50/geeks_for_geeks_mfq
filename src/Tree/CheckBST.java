package Tree;

public class CheckBST {
    TNode root;

    boolean checkBST(TNode node, int min, int max) {
        if (node == null) return true;
        if (node.data < min || node.data > max) return false;

        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data+1, max);
    }

    public static void main(String[] args) {
        CheckBST binaryTree = new CheckBST();
        binaryTree.root = new TNode(32);
        binaryTree.root.left = new TNode(21);
        binaryTree.root.right = new TNode(73);
        binaryTree.root.left.left = new TNode(5);
        binaryTree.root.left.right = new TNode(28);

        binaryTree.root.right.left = new TNode(55);
        binaryTree.root.right.right = new TNode(84);

        System.out.println(binaryTree.checkBST(binaryTree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }
} 