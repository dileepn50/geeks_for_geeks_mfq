package Tree;

public class BinaryTree {
    TNode root;
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new TNode(10);
        binaryTree.root.left = new TNode(20);
        binaryTree.root.right = new TNode(12);
        binaryTree.root.left.left = new TNode(34);

        TNode root = binaryTree.root;
        System.out.println(root.data);
        System.out.println(root.left.data);
    }
} 