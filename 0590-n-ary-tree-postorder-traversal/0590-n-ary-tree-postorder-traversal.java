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
    private void postorder(Node node, List<Integer> list) {
    if (node == null) return;
    for (var child : node.children)
      postorder(child, list);
    list.add(node.val);
  }
  public List<Integer> postorder(Node root) {
    List<Integer> list = new ArrayList<>();
    postorder(root, list);
    return list;
  }
}