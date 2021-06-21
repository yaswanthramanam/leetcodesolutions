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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode q=new ListNode(0);
        q.next=head;
        if(head==null||head.next==null){
            return null;
        }
        if(head.next.next==null){
            if(n==1){
                head.next=null;
                return head;
            }
            return head.next;
        }
        ListNode slow=q;
        ListNode fast=q;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
            
            
        }
        slow.next=slow.next.next;
        return q.next;
    }
}