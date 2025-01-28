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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new LinkedList<>();
        if(root == null) return answer;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int s = size;
            Double average = 0.0;
            while(size != 0){
                TreeNode temp = queue.poll();
                average = average + (temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                size--;
            }
            average = (Double)average/s;
            answer.add(average);
        }
        return answer;
    }
}