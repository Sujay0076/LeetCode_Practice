/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        Node h  = head;
        Node t = head;
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        int sum =0;
        int count =1;
        
        while(h != null && h.next != null){
            h = h.next;
            count++;
        }
        t = h;
        h = head;
        int i =1;
        int j = count;
        
        while(i < j){
            sum = h.data + t.data;
            ArrayList<Integer> list = new ArrayList<>();
            if(sum > target){
                t = t.prev;
                j--;
            }
            else if(sum < target){
                h = h.next;
                i++;
            }
            else{
                list.add(h.data);
                list.add(t.data);
                h = h.next;
                t = t.prev;
                i++;
                j--;
            }
            if(! list.isEmpty()){
                res.add(list);
            }
        }
        return res;
    }
}
