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
    public int maxdepth(Node root, int depth){
        if(root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int a = 0;
            int Size = queue.size();
            while(Size != 0){
                Node temp = queue.poll();
                for(int i=0; i<temp.children.size(); i++){
                    queue.add(temp.children.get(i));
                }
                Size--;
                a = 1;
            }
            depth += a;
        }
        return depth;
    }

    public int maxDepth(Node root) {
        int depth = 0;
        depth = maxdepth(root, depth);
        return depth;
    }
}