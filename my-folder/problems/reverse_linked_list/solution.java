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
    
// public ListNode reverseList(ListNode head) {
//     /* iterative solution */
//     ListNode newHead = null;
//     while (head != null) {
//         ListNode next = head.next;
//         head.next = newHead;
//         newHead = head;
//         head = next;
//     }
//     return newHead;
// }

public ListNode reverseList(ListNode head) {
    /* recursive solution */
    return reverseListInt(head, null);
}

private ListNode reverseListInt(ListNode head, ListNode newHead) {
    if (head == null)
        return newHead;
    ListNode next = head.next;
    head.next = newHead;
    return reverseListInt(next, head);
}
}