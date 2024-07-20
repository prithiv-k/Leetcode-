class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> l1 = new ArrayList<>();
        ListNode temp = head;
        int count=0;
        while (temp!=null) {
            count++;
            l1.add(temp);
            temp = temp.next;
        }
        if (n == count) {
            return head.next;
        }
        int rem = count - n;
        ListNode temp1 = l1.get(rem - 1);
        temp1.next = temp1.next.next;
        
        return head;
    }
}
