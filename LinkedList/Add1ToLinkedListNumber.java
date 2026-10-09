/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head == null){
            return null;
        }
        Node reverseHead = reverse(head);
        
        Node temp = reverseHead;
       
        int c =0;
        
        while(temp != null){
            if(temp.data+1 > 9){
                temp.data = 0;
                c =1;
            }
            else{
                temp.data = temp.data+1;
                break;
            }
            temp = temp.next;
        }
        
        Node newHead = null;
        
        if(temp == null && c == 1){
            Node node = new Node(1);
            newHead = node;
            newHead.next = reverseHead;
        }
        else{
            newHead = reverse(reverseHead);   
        }
        return newHead;
        
    }
    private Node reverse(Node head){
        Node prev = null;
        Node temp = head;
        
        while(temp != null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
