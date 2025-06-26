// Last updated: 6/26/2025, 10:42:50 PM
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
        ListNode front=head;
        ListNode back=head;
        if(head==null) return null;
        while(n!=0){
            front=front.next;
            n--;
        }
        if(front==null)return head.next;
        while(front.next!=null){
            front=front.next;
            back=back.next;
        }
        back.next=back.next.next;
        return head;
    }
}