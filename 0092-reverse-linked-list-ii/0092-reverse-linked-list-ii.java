class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;

        // Move before to the node before left
        for(int i = 1; i < left; i++){
            before = before.next;
        }

        ListNode start = before.next;
        ListNode leftNode = start;

        ListNode prev = null;

        int count = right - left + 1;

        while(count > 0){
            ListNode next = start.next;
            start.next = prev;
            prev = start;
            start = next;
            count--;
        }

        before.next = prev;
        leftNode.next = start;

        return dummy.next;
    }
}