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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> li=new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<li.size();i++){
            if(i%2==0){
                even.add(li.get(i));
            }
        }
        
         List<Integer> odd=new ArrayList<>();
        for(int i=0;i<li.size();i++){
            if(i%2!=0){
                odd.add(li.get(i));
            }
        }
        
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<even.size();i++){
            ans.add(even.get(i));
        }
        for(int i=0;i<odd.size();i++){
            ans.add(odd.get(i));
        }
        ListNode h=null;
        ListNode t=null;
        for(int i=0;i<ans.size();i++){
            ListNode nn=new ListNode(ans.get(i));
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