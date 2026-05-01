/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    void reorderList(ListNode* head) {
        if(!head || !head->next)
            return;
        ListNode* slow = head;
        ListNode* fast = head->next;
        while(fast && fast->next){
            fast = fast -> next;
            slow = slow -> next;
            if(fast->next){
                fast = fast -> next;
            }
        }
        ListNode* head2 = reverse(slow->next);
        slow->next = NULL;
        printList(head2);
        printList(head);
        orderList(head,head2);
    }
    ListNode* reverse(ListNode* head){
        if(!head || !head->next)
            return head;
        ListNode* cur = head ;
        ListNode* prev = NULL ;
        while(cur){
            ListNode* temp = cur->next;
            cur->next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    void printList(ListNode* head){
        ListNode* temp = head;
        while(temp){
            cout<<temp->val<<"-";
            temp = temp->next;
        }
    }
    void orderList(ListNode* head,ListNode* head2){
        ListNode* temp=head;
        while(head2){
            ListNode* temp2=head->next;
            head->next = head2;
            ListNode* temp3=head2->next;
            head2 -> next = temp2;
            head = temp2;
            head2 = temp3;
        }
        head = temp;
    }
};
