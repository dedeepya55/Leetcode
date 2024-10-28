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
        if(head==null){return null;}
        if(head.next==null){
            return null;
        }
        ListNode a=head;
        ListNode b=head;
        int length=0;
        while(a!=null){
            length++;
            a=a.next;
        }
        ListNode c=head;
        if(n==length){
            return head.next;
        }
        for(int i=0;i<length-2;i++){
            c=c.next;
            System.out.println(c.val);
        }
        if(n==1){
            c.next=null;
            return head;
        }
        for(int i=0;i<length-n-1;i++){
            b=b.next;System.out.println(b.val);
        }
        if(b.next!=null){
        ListNode h1=b.next.next;
        if(h1!=null){
        b.next=h1;}
        }
        return head;
    }
}