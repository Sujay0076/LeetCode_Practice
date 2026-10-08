import java.util.*;
public class Main {

    static class Node {
        int data;
        Node next;
        Node child;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node child) {
            this.data = data;
            this.next = next;
            this.child = child;
        }
    }

    public static void main(String[] args) {

        // Main list
        Node n5 = new Node(5);
        Node n10 = new Node(10);
        Node n19 = new Node(19);
        Node n28 = new Node(28);

        n5.next = n10;
        n10.next = n19;
        n19.next = n28;

        // Child list of 10
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n30 = new Node(30);

        n10.child = n7;
        n7.child = n8;
        n8.child = n30;

        // Child list of 19
        Node n20 = new Node(20);
        n19.child = n20;

        // Child list of 28
        Node n22 = new Node(22);
        Node n35 = new Node(35);

        n28.child = n22;
        n22.child = n35;

        Node head = n5;

        // Call your method here
        Node result = flatten(head);

        // Print flattened list using child
        Node temp = result;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.child;
        }
    }

    static Node flatten(Node head) {
        Node temp = head;
        Node newHead = null;
        Node tail = null;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.data-b.data);
        while(temp != null){
            Node curr = temp;
                while(curr != null){
                    pq.add(curr);
                    curr = curr.child;
                }
            temp = temp.next;
        }
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            Node node = new Node(curr.data);
            if(newHead == null && tail == null){
                newHead = node;
                tail = node;
            }
            else{
                tail.child = node;
                tail = node;
            }
        }
        return newHead;
    }  
}
