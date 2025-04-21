package DSAProblems.tree;

import java.awt.image.renderable.RenderableImage;

public class MaximumDepthOfBInaryTree {
    /*
    TODO its a Depth first Search Problem
    to find out maximum depth we need to do recursively compute depth of left subtree
    recursively compute depth of right subTree
    then max depth 1 + max(left,right)

    * */

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode leftNode = new TreeNode(4);
        treeNode.left = leftNode;
        leftNode.left = new TreeNode(1);
        TreeNode leftNodeOfLeftNode = leftNode.left;
        leftNodeOfLeftNode.left = new TreeNode(5);
        TreeNode rightNode = new TreeNode(7);
        treeNode.right = rightNode;
        System.out.println("max depth : "+findMaxDepth(treeNode));

    }

    private static int findMaxDepth(TreeNode treeNode) {
        if (treeNode == null){
            return  0;
        }
        int leftDepth = findMaxDepth(treeNode.left);
        int rightDepth = findMaxDepth(treeNode.right);
        return  1+ Math.max(leftDepth,rightDepth);
    }
}

