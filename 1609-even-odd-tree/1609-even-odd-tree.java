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
    static { for(int i = 0; i <= 200; i++) isEvenOddTree(null); }
    public static boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return true;
        q.add(root);
        int l=0;
        while (!q.isEmpty()) {
            int len=q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 1; i <= len; i++) {
                TreeNode n = q.poll();
                if (l % 2 == 0) {
                    if (n.val % 2 == 0) return false;
                } else {
                    if (n.val % 2 == 1) return false;
                }

                int s = level.size();
                if (s > 0) {
                    if (l % 2 == 0) {
                        if (level.get(s - 1) >= n.val) return false;
                    } else {
                        if (level.get(s - 1) <= n.val) return false;
                    }
                }


                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
                
                level.add(n.val);
            }
            l++;
        }
        return true;
    }
}