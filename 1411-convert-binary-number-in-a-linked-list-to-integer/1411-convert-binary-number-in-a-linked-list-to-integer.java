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
    public int getDecimalValue(ListNode head) {
        ListNode a=head;int l=0;
        while(a!=null){
            l++;
            a=a.next;
        }
        l=l-1;
        ListNode b=head;int c=0;
        while(b!=null){
            c+=(b.val)*Math.pow(2,l);
            l=l-1;
            b=b.next;
        }
        return c;
    }
}