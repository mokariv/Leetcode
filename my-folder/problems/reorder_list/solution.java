/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow;
        ListNode fast;
        slow = head;
        fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = reverse(slow.next);
        slow.next = null;
        slow = head;
        ListNode dummy = null;
        while(fast!=null){
            dummy = slow.next;
            slow.next = fast;
            fast = fast.next;
            slow.next.next = dummy;
            slow = dummy;
        }    
}
    
    ListNode reverse(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        ListNode fast;
        while(current!=null){
            fast= current.next;
            current.next = previous;
            previous = current;
            current = fast;
        }
        return previous;
    }
}