/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void levelorder(Node root, List<List<Integer>> list){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            while(size != 0){
                Node temp = queue.poll();
                for(int i=0; i<temp.children.size(); i++){
                    queue.add(temp.children.get(i));
                }
                level.add(temp.val);
                size--;
            }
            list.add(level);
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelorder(root, result);
        return result;
    }
}