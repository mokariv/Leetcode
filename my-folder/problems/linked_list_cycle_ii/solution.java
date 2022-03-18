/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while (slow != null && fast != null) {
            slow = slow.next;
            if(fast.next == null){
                return null;
            }
            fast = fast.next.next;
            if(slow != null && fast != null && slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next; 
                }
                return slow;
            }
        }
        return null;

}
}