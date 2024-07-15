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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode current=head;
        int o=0;
        while(current!=null)
        {
            o=o+1;
            current=current.next;
        }
        ListNode first=head; ListNode second=head;
       for(int i=1;i<k;i++)
       {
            first=first.next;
       }
       for(int i=1;i<(o-k+1);i++)
       {
            second=second.next;
       }
    //    System.out.println(first.val);
    //    System.out.println(second.val);
       int temp=first.val;
       first.val=second.val;
       second.val=temp;

       return head;
    }
}