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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<>();
        if(root == null) return answer;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new LinkedList<>();
            int size = queue.size();
            while(size != 0){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                size--;
            }
            stack.push(temp);
        }
        while(!stack.isEmpty()){
            answer.add(stack.pop());
        }
        return answer;
    }
}