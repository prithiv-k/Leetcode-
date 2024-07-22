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
    public ListNode sortList(ListNode head) {
        List<Integer> li=new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        Collections.sort(li);
        ListNode h=null;
        ListNode t=null;
        for(int i=0;i<li.size();i++){
            ListNode nn=new ListNode(li.get(i));
            if(h==null){
                h=nn;
                t=nn;
            }else{
                t.next=nn;
                t=t.next;
            }
        }return h;
        
    }
}