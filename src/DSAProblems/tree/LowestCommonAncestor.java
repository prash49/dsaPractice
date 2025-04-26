package DSAProblems.tree;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode leftNode = new TreeNode(4);
        treeNode.left = leftNode;
        leftNode.left = new TreeNode(1);
        TreeNode leftNodeOfLeftNode = leftNode.left;
        leftNodeOfLeftNode.left = new TreeNode(5);
        TreeNode rightNode = new TreeNode(7);
        treeNode.right = rightNode;
//        findLCA(treeNode);

    }
    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val < root.val && q.val < root.val)
            return findLCA(root.left, p, q);
        else if (p.val > root.val && q.val > root.val)
            return findLCA(root.right, p, q);
        else
            return root;
    }
}
