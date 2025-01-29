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
    int ans = Integer.MAX_VALUE;
    Integer pred = null;
    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        if(pred != null){
            ans = Math.min(ans, root.val - pred);
        }
        pred = root.val;
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
}