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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode current = head;
        while (current != null) {
            n++;
            current = current.next;
        }

        int partSize = n / k;
        int extraNodes = n % k;

        ListNode[] parts = new ListNode[k];
        current = head;

        for (int i = 0; i < k; i++) {
            parts[i] = current;

            int currentPartSize = partSize + (i < extraNodes ? 1 : 0);

            for (int j = 0; j < currentPartSize - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }

            if (current != null) {
                ListNode nextPart = current.next;
                current.next = null;
                current = nextPart;
            }
        }

        return parts;
    }
}
