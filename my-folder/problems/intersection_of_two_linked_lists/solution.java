/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode CurrentA = headA;
        ListNode CurrentB = headB;
        int CountA =0;
        int CountB = 0;
        //Count number of nodes in ListA;
        while (CurrentA != null) {
            CountA++;
            CurrentA = CurrentA.next;
        }
        // Count number of nodes in ListB;
        while (CurrentB != null) {
            CountB++;
            CurrentB = CurrentB.next;
        }
        
        while (CountA > CountB) {
            headA = headA.next;
            CountA--;
        }
        while (CountB > CountA) {
            headB = headB.next;
            CountB--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
        
        
    }
}
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if (headA == null || headB == null) {
//             return null;
//         }
//         ListNode CurrentA = headA;
//         ListNode CurrentB = headB;
//         int CountA =0;
//         int CountB = 0;
//         //Count number of nodes in ListA;
//         while (CurrentA != null) {
//             CountA++;
//             CurrentA = CurrentA.next;
//         }
//         // Count number of nodes in ListB;
//         while (CurrentB != null) {
//             CountB++;
//             CurrentB = CurrentB.next;
//         }
//         int diff = Math.abs(CountA-CountB);
//         ListNode tempA = headA;
//         ListNode tempB = headB;
//         if (CountA > CountB) {
//             while (diff>0) {
//                 tempA = tempA.next;
//                 diff--;
//             }
//             while (tempA != null && tempB != null){
//                 if(tempA == tempB){
//                     return tempA;
//                 }
//                 tempA = tempA.next;
//                 tempB = tempB.next;
//             }
//         }
//         else if(CountB > CountA) {
//             while (diff>0) {
//                 tempB = tempB.next;
//                 diff--;
//             }
//             while (tempA != null && tempB != null){
//                 if(tempA == tempB){
//                     return tempA;
//                 }
//                 tempA = tempA.next;
//                 tempB = tempB.next;
//             }
//         }
//         else if(CountA == CountB){
//             while (tempA != null && tempB != null){
//                 if(tempA == tempB){
//                     return tempA;
//                 }
//                 tempA = tempA.next;
//                 tempB = tempB.next;
//             }   
//         }
//         return null;
        
        
//     }
// }