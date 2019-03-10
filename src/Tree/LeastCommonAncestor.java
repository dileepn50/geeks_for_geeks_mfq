package Tree;

public class LeastCommonAncestor {
    TNode root;

    boolean lcaBinaryTree(TNode node, int leftData, int rightData) {
        if (node == null) return false;
        boolean flag = false;
        if (node.data == leftData || node.data == rightData) {
            flag = true;
        }

        boolean firstData = lcaBinaryTree(node.left, leftData, rightData);
        boolean secondData = lcaBinaryTree(node.right, leftData, rightData);
        boolean result = firstData || secondData;
        boolean result1 = firstData && secondData;

        if (flag && result) {
            System.out.println("anc is " + node.data);
            return false;
        }

        if (result1) {
            System.out.println("anc is " + node.data);
            return false;
        }

        return (flag || result);
    }

    public static void main(String[] args) {
        LeastCommonAncestor binaryTree = new LeastCommonAncestor();
        binaryTree.root = new TNode(20);
         TNode root = binaryTree.root;
         root.left = new TNode(8);
         root.right = new TNode(22);
         root.left.left = new TNode(4);
         root.left.right = new TNode(12);
         root.left.right.left = new TNode(10);
         root.left.right.right = new TNode(14);

         root.right.left = new TNode(5);

         binaryTree.lcaBinaryTree(binaryTree.root, 8, 14);

    }
} 