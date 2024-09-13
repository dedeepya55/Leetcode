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
    public ListNode GCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        ListNode n=new ListNode(a);
        return n;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current=head;
        int a,b;
        while(head!=null && head.next!=null){
            a=head.val;
            b=head.next.val;
            ListNode c=GCD(a,b);
            ListNode k=head.next;
            head.next=c;
            c.next=k;
            head=head.next.next;
        }
        return current;
    }
}