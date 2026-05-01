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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while(true){
            ListNode kth = getKth(groupPrev,k);
            if(kth==null){
                break;
            }
            ListNode groupnext = kth.next;
            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;
            while(curr!=groupnext){
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }
            ListNode tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;

        }
        return dummy.next;
    }
    ListNode getKth(ListNode head, int k){
        while(head!=null && k-->0){
            head = head.next;
        }
        return head;
    }
    ListNode reverse(ListNode head){
        ListNode temp = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}
