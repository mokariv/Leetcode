/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node leftNode = root;
        while(leftNode != null && leftNode.left !=null){
            popoulate(leftNode);
            leftNode = leftNode.left;
        }
        return root;
        
    }
    
    public static void popoulate(Node leftNode){
        Node itr = leftNode;
        while(itr != null){
            itr.left.next =itr.right;
            if(itr.next != null){
                itr.right.next = itr.next.left;
            }
            itr = itr.next;
        }
    }
}