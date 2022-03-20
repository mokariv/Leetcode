/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node currentHead = clone(head);
        Node copyCurrent = currentHead;
        while (current != null) {
            copyCurrent.next = clone(current.next);
            copyCurrent.random = clone(current.random);
            current = current.next;
            copyCurrent = copyCurrent.next;        
        }
        return currentHead;
        

}
    private Node clone(Node node){
    if (node == null) return null;
    if (map.containsKey(node)) return map.get(node);
     Node temp  = new Node(node.val);
     map.put(node, temp);
     return temp;
    }
}