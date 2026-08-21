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
    public ListNode reverseList(ListNode head) {
        ListNode st = head;
        ListNode prev = null;
        while(st!=null){
             ListNode next = st.next;
        st.next = prev;
        prev = st;
        st = next;
        }
       return prev;
    }
}