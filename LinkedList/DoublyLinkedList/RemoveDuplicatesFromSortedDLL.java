/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        Node temp = headRef;
        
        while(temp != null && temp.next != null){
            Node next = temp.next;
          
            if(temp.data == next.data){
                if(temp.prev == null && temp == headRef){
                    headRef = next;
                    next.prev = null;
                    temp.next = null;
                }
                else{
                    Node prev = temp.prev;
                    prev.next = next;
                    next.prev = prev;
                    temp.next = null;
                    temp.prev = null;
                }
            }
            temp = next;
            
        }
        return headRef;
    }
}
