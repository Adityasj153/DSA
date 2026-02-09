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
        ListNode temp = head;
        int siz = 0;
        while(temp != null){
            temp = temp.next;
            siz++;
        }

        if(n == siz){
            head = head.next;
            return head;
        }

        ListNode prev = head;
        int idx = 1;
        int idxToFind = siz - n;
        while(idx < idxToFind){
            prev = prev.next;
            idx++;
        }
        prev.next = prev.next.next;
        return head;
    }
}