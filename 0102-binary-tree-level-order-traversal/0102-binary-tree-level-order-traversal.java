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
    public void levelorder(TreeNode root, List<List<Integer>> answer){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int s = queue.size();
            List<Integer> Temp = new LinkedList<>();
            while(s != 0){
                TreeNode temp = queue.poll();
                // List<Integer> Temp = new LinkedList<>();
                Temp.add(temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right); 
                s--;
            }
            answer.add(Temp);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) return answer;
        levelorder(root, answer);
        return answer;   
    }
}