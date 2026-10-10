/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null){
            return null;
        }
        
        Node temp = head;
        
        Node zero = null;
        Node tailZero = null;
        Node one = null;
        Node tailOne = null;
        Node two = null;
        Node tailTwo = null;
        
        while(temp != null){
            Node next = temp.next;
            temp.next = null;
            if(temp.data == 0){
                if(zero == null && tailZero == null){
                    zero = temp;
                    tailZero = temp;
                }
                else{
                    tailZero.next = temp;
                    tailZero = temp;
                }
            }
            else if(temp.data == 1){
                if(one == null && tailOne == null){
                    one = temp;
                    tailOne = temp;
                }
                else{
                    tailOne.next = temp;
                    tailOne = temp;
                }
            }
            else{
                if(two == null && tailTwo == null){
                    two = temp;
                    tailTwo = temp;
                }
                else{
                    tailTwo.next = temp;
                    tailTwo = temp;
                }
            }
            temp = next;
        }
        
        Node dummy = new Node(-1);
        Node tail = dummy;
        if(zero != null){
            tail.next = zero;
            tail = tailZero;
        }
        if(one != null){
            tail.next = one;
            tail = tailOne;
        }
        if(two != null){
            tail.next = two;
            tail = tailTwo;
        }
        
        return dummy.next;
        
    }
   
}
