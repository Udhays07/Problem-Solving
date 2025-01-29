/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null) result.append("#$");
            else{
                result.append(node.val+"$");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         if (data.isEmpty()) return null;
        String[] stringnode = data.split("\\$");
        TreeNode root = stringnode[0].equals("#") ? null : new TreeNode(Integer.parseInt(stringnode[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for(int index=1; index<stringnode.length; index++){
            TreeNode parent = queue.poll();
            if(!stringnode[index].equals("#")){
                System.out.println(stringnode[index]);
                TreeNode left = new TreeNode(Integer.parseInt(stringnode[index]));
                parent.left = left;
                queue.offer(left);
            } 
            if(!stringnode[++index].equals("#")){
                TreeNode right = new TreeNode(Integer.parseInt(stringnode[index]));
                parent.right = right;
                queue.offer(right);
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;