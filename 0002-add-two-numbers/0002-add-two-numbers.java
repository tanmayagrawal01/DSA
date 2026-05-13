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
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        int prev=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+prev;
            if(sum>=10){
                prev=1;
                sum-=10;
            }else{
                prev=0;
            }
            ListNode newnode=new ListNode(sum);
            temp.next=newnode;
            temp=newnode;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+prev;
            if(sum>=10){
                prev=1;
                sum-=10;
            }else{
                prev=0;
            }
            ListNode newnode=new ListNode(sum);
            temp.next=newnode;
            temp=newnode;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+prev;
            if(sum>=10){
                prev=1;
                sum-=10;
            }else{
                prev=0;
            }
            ListNode newnode=new ListNode(sum);
            temp.next=newnode;
            temp=newnode;
            l2=l2.next;
        }
        if(prev==1){
            ListNode newnode=new ListNode(prev);
            temp.next=newnode;
            temp=newnode;
        }
        return ans.next;
    }
}