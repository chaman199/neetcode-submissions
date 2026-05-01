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
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            pre = cur;
            cur = cur.next;
            pre.next = temp;
            temp = pre;
        }
        return temp;
    }
}
