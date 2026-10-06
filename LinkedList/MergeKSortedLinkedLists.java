import java.util.*;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode[] arr = new ListNode[n];

        for(int i=0;i<n;i++){
            ListNode head = null;
            ListNode tail = head;
            int nodes = sc.nextInt();
            for(int j=0;j<nodes;j++){
                int value = sc.nextInt();
                ListNode newnode = new ListNode(value);
                if(head == null && tail == null){
                    head = newnode;
                    tail = newnode;
                }
                else{
                    tail.next = newnode;
                    tail = newnode;
                }
            }
            arr[i] = head;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val-b.val);
        for(int i=0;i<arr.length;i++){
            if(arr[i] != null){
                pq.add(arr[i]);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            tail.next = temp;
            if(temp.next != null){
                temp = temp.next;
                pq.add(temp);
            }
            tail = tail.next;
        }

        ListNode temp = dummy.next;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }  
    }
}
