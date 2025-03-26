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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode result = new ListNode();
        ListNode curr = result;
        for(int value: list) {
            curr.next = new ListNode(value);
            curr = curr.next;
        }

        return result.next;
    }
}