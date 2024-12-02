/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
          if( head == null) return null;
        // method 1 : using hashing 
        // HashSet<ListNode> s = new HashSet<>();
        // ListNode temp = head;
        // while(temp != null){
        //     if(s.contains(temp)){
        //         return temp;
        //     }
        //     else {
        //         s.add(temp);
        //     }
        //     temp = temp.next;
        // }
        // return null;

        // method 2 : using slow and fast pointer

        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while( fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if( fast == slow){
                // cycle present 
                flag = true;
                break;
            }

        }
        if( flag == true){
           slow = head;
           while(true){
            if( slow == fast)
            return slow;

            slow = slow.next;
            fast = fast.next;
           }
        }
        else{
            return null;
        }
    }
}