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
    boolean check=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return check;
        }
        if((p==null && q!=null)||(q==null && p!=null)||(p.val!=q.val)){
            check=false;
            return check;
        }
        isSameTree(p.left,q.left);
        isSameTree(p.right,q.right);
        return check;
    }
}