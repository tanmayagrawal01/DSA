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
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null;
        ListNode agla = null;
        ListNode temp = head;
        while (temp != null) {
            agla = temp.next;
            temp.next = prev;
            prev = temp;
            temp = agla;
        }
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        int carry = 0;
        while (prev != null) {
            int sum = prev.val * 2 + carry;
            carry = sum / 10;
            int val = sum % 10;
            curr.next = new ListNode(val);
            curr = curr.next;
            prev = prev.next;

        }
        if (carry == 1) {
            curr.next = new ListNode(1);
        }
        prev = null;
        agla = null;
        temp = ans.next;
        while (temp != null) {
            agla = temp.next;
            temp.next = prev;
            prev = temp;
            temp = agla;
        }
        return prev;
    }
}