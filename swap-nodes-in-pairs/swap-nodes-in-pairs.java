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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=temp;
      
        ListNode fast=temp.next;
        
        
        while(fast!=null&&fast.next!=null){
            int v2=slow.val;
            slow.val=fast.val;
            fast.val=v2;
            
            slow=fast.next;
            fast=fast.next.next;
            
            
            
        }
        
        if(fast!=null&&fast.next==null){
            int v=fast.val;
            fast.val=slow.val;
            slow.val=v;
            return head;
            
        }
        
        
        return head;
    }
}