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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode l3=head;
        //ListNode curr;
        int carry=0;
        while(l1!=null||l2!=null){
            int sum1=(l1!=null)?l1.val:0;
            int sum2=(l2!=null)?l2.val:0;
            int lastdigit=(sum1+sum2+carry)%10;
            ListNode curr=new ListNode(lastdigit);
            l3.next=curr;
            carry=(sum1+sum2+carry)/10;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3=l3.next;
            
            
        }
        if(carry>0){
        ListNode curr=new ListNode(carry);
           l3.next=curr;
           l3=l3.next;
        }
        return head.next;
        
    }
}