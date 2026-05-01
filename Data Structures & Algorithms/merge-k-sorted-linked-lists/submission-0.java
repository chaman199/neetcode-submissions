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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode temp = head;
        boolean hasMoreNodes = true;
        while(hasMoreNodes){
            hasMoreNodes = false;
            int min = 1001;
            ListNode minNode = null;
            int ind = -1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null && min > lists[i].val){
                    min = lists[i].val;
                    minNode = lists[i];
                    hasMoreNodes = true;
                    ind = i;
                }
            }
            if(hasMoreNodes){
                head.next = minNode;
                head = head.next;
                lists[ind] = minNode.next;
            }
        }
        return temp.next;
    }
}
