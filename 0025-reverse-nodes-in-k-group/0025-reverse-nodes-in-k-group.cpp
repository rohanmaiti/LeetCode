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
bool checkAvailable(ListNode *curr,int k){
    ListNode *temp = curr;
    int count = 0;
    while(count != k ){
      if(temp!=NULL)
      temp = temp->next;
      else 
      return false;
      count++;
    }
    return true;
}
    ListNode *reverse(ListNode *curr,ListNode *next,int k){
        if(curr == NULL)
        return NULL;
       int x= k;
       int y = k;
       ListNode *temp = curr;
       ListNode *prev = NULL;
       bool condition = checkAvailable(curr,k);
       if(condition){
        while(x-- && curr!=NULL ){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        temp->next = reverse(curr,next,k);
        return prev;
       }
       else {
        return curr;
       }
    }
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(head == NULL)
        return head;
        ListNode *curr = head;
        ListNode *next;
        ListNode* head2 = reverse(curr,next,k);
        return head2;
        
    }
};