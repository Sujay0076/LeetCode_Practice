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
    public ListNode reverseKGroup(ListNode head, int k) {
    
        int count =0;
        ListNode temp = head;
        ListNode newHead = null;
        ListNode start = head;
        ListNode previousNode = null;
        while(temp != null){
            count++;
            if(count == k){

                ListNode nextNode = temp.next;
                ListNode reverseHead = reverse(start,k);

                if(previousNode != null){
                    previousNode.next = reverseHead; 
                }
                else{
                    newHead = reverseHead;
                }

                start.next = nextNode;
                previousNode = start;
                start = nextNode;
                count =0;
                temp = nextNode;
            }
            else{
            temp = temp.next;
            }
        }
        return newHead;
    }
    private ListNode reverse(ListNode head,int k){
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null && k > 0){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            k--;
        }
        return prev;
    }
}
