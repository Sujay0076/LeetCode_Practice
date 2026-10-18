class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(cal(a[0], a[1]), cal(b[0], b[1])));

        for(int[] p : points){
            pq.offer(p);
        } 

        int[][] arr = new int[k][2];
        for(int i=0;i<k;i++){
            arr[i] = pq.poll();
            
        }
        return arr;
        
    }

    private int cal(int a,int b){

        return a * a + b * b;
    }
}
