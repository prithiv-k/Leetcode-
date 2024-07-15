/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> li=new ArrayList<>();
        while(head!=null){
            
            if(li.contains(head)){
                return true;
            }else{
                li.add(head);
                head=head.next;
            }

        }return false;

        
    }
}