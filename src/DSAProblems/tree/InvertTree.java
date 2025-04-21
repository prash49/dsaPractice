package DSAProblems.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
    /*
    *
     4
    / \
   2   7
  / \ / \
 1  3 6  9   to
 *   4
    / \
   7   2
  / \ / \
 9  6 3  1
    *
    * */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        // Level 2
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        // Level 3
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        printLevelOrder(root);
        invertTree(root);
        System.out.println("---------------------------------after inverting");
        printLevelOrder(root);
    }

    private static TreeNode invertTree(TreeNode root) {
        // InvertTree using Swapping
        if (root ==null){
            return null;
        }
        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right  = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            while (levelSize-- > 0) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            System.out.println(); // new line for each level
        }
    }
}
