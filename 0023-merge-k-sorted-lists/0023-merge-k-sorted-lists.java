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
    public ListNode mergeKLists(ListNode[] lists){
        int n = lists.length;
        if(n == 0 || lists == null){
            return null;
        }
        if(n == 1) return lists[0];
        ListNode result = new ListNode(-1);
        ListNode dummy = result;
        for(int i=1; i<n; i++){
            ListNode l1 = lists[i];
            ListNode l2 = lists[i-1];
            while(l1 != null && l2 != null){
                if(l1.val > l2.val){
                    dummy.next = l2;
                    l2 = l2.next;
                }else{
                    dummy.next = l1;
                    l1 = l1.next;
                }
                dummy = dummy.next;
            }
            if(l1 == null){
                dummy.next = l2;
            }else{
                dummy.next = l1;
            }
            lists[i] = result.next;
            dummy = result;
        }
        return result.next;
    }
}