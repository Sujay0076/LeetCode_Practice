/*Structure of the doubly linked list  Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/

class Solution {
    public Node deleteAllOccurOfX(Node head, int x) {
        // code here
        Node temp = head;
        
        
        while(temp != null){
            
            Node next = temp.next;
            
            if(temp.data == x){
                if(temp.prev == null){
                    head = next;
                }
                else{
                    temp.prev.next = next;
                }
                if(next != null){
                    next.prev = temp.prev;
                }
                temp.next = null;
                temp.prev = null;
            }
            temp = next;
            
        }
        return head;
    }
}
