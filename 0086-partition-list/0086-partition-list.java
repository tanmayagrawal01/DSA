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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);
        ListNode lefttail=left;
        ListNode righttail=right;
        while(head!=null){
            if(head.val>=x){
                righttail.next=head;
                righttail=righttail.next;
                
            }else{
                lefttail.next=head;
                lefttail=lefttail.next;
            }
            head=head.next;
        }
        righttail.next=null;
        lefttail.next=right.next;
        return left.next;
    }
}