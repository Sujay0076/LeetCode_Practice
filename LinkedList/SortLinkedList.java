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

        if(head == null || head.next == null){
            return null;
        }

        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        return merge(sortList(head),sortList(second));
    }
    public ListNode merge(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(a != null && b != null){
            if(a.val <= b.val){
               tail.next = a;
               a = a.next;
            }
           else{
              tail.next = b;
              b = b.next;
           }
           tail = tail.next;
        }
        tail.next = (a != null) ? a:b;
        return dummy.next;
    }
}
