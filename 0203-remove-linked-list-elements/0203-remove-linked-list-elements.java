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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(head != null){
            if(head.val != val){
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}