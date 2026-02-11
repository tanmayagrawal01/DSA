/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void pre(TreeNode node, ArrayList<Integer> a) {
        if (node == null) {
            a.add(9999);
            return;
        }
        a.add(node.val);
        pre(node.left, a);
        pre(node.right, a);
    }

    public void post(TreeNode node, ArrayList<Integer> b) {
        if (node == null) {
            b.add(9999);
            return;
        }
        post(node.left, b);
        post(node.right, b);
        b.add(node.val);
    }

    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        pre(root.left, a);
        post(root.right, b);
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(b.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}