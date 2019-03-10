package Tree;

public class BinaryTreeDLL {
    TNode root;
    TNode prev, head;
    void bTDll(TNode node) {
        if (node == null) return;

        bTDll(node.left);
        if (prev == null) {
            head = node;
        }
        else {
            node.left = prev;
            prev.right = node;
        }
        prev = node;
        bTDll(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeDLL binaryTree = new BinaryTreeDLL();
        binaryTree.root = new TNode(10);
        binaryTree.root.left = new TNode(12);
        binaryTree.root.right = new TNode(15);
        binaryTree.root.left.left = new TNode(25);
        binaryTree.root.left.right = new TNode(30);

        binaryTree.root.right.left = new TNode(36);

        binaryTree.bTDll(binaryTree.root);
        TNode temp = binaryTree.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }

    }
} 