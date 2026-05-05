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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int l=1;
        while(temp.next!=null){
            l++;
            temp=temp.next;
        }
        k=k%l;
        temp.next=head;
        int step=l-k;
        while(step-- >0){
            head=head.next;
        }
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}