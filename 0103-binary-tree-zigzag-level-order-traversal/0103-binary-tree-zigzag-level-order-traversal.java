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
    public void zigzag(TreeNode root, List<List<Integer>> list){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean a = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            Stack<Integer> s = new Stack<>();
            while(size != 0){
                TreeNode node = queue.poll();
                if(node.left != null)queue.add(node.left);
                if(node.right != null)queue.add(node.right);
                if(a == false){
                    s.push(node.val);
                }
                else{
                    temp.add(node.val);
                }
                size--;
            }
            if(a == false){
                while(!s.isEmpty()){
                    temp.add(s.pop());
                }
            }
            a = !a;
            list.add(temp);
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        zigzag(root, result);
        return result;
    }
}