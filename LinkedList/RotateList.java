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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head;
        }
        int count =0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        k = k % count;
        if(k == 0){
            return head;
        }
        temp = head;
        int currCount = 0;
        while(temp != null){
            currCount++;
            if(count-k == currCount){
                break;
            }
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        temp = newHead;
        while(temp != null && temp.next != null){
            temp = temp.next;
        }
        temp.next= head;
        return newHead;
    }
    
}
