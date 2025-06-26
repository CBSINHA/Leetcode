// Last updated: 6/26/2025, 10:42:55 PM
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
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(l1!=null||l2!=null){
            int sum=0;
            if(l1!=null&&l2!=null){
                sum+=(l1.val+l2.val+carry)%10;
                carry=(l1.val+l2.val+carry)/10;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null){
                sum+=(carry+l1.val)%10;
                carry=(carry+l1.val)/10;
                l1=l1.next;
            }
            else if(l2!=null){
                sum+=(carry+l2.val)%10;
                carry=(carry+l2.val)/10;
                l2=l2.next;
            }
            ListNode temp=new ListNode(sum);
            tail.next=temp;
            tail=tail.next;
        }
        if(carry>0){ListNode tmp=new ListNode(carry);
        tail.next=tmp;}
        return dummy.next;
    }
}