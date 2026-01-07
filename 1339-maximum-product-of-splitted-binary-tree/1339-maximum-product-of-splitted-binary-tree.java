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

    static long ans=0,sum=0;
    static{
        for(int i=0;i<=200;i++){
            maxProduct(null);
        }
    }
    public static void tsum(TreeNode root){
        if(root==null) return;
        sum+=root.val;
        tsum(root.left);
        tsum(root.right);
    }
    public static int helper(TreeNode root){
        if(root==null) return 0;
        int curr=root.val+helper(root.left)+helper(root.right);
        ans=Math.max(ans,curr*(sum-curr));
        return curr;
    }
    public static int maxProduct(TreeNode root) {
        ans=0;
        sum=0;
        tsum(root);
        helper(root);
        return (int)(ans%1000000007);
    }
}