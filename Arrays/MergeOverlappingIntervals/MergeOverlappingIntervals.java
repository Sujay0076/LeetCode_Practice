class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start = arr[0][0];
        int end = arr[0][1];
        List<int[]> res = new ArrayList<>();

        for(int i=1;i<arr.length;i++){
            int currStart = arr[i][0];
            int currEnd = arr[i][1];

            if(currStart <= end){
                end = Math.max(end,currEnd);
            }
            else{
                res.add(new int[]{start,end});
                start = currStart;
                end = currEnd;
            }
        }
        res.add(new int[]{start,end});

        return res.toArray(new int[res.size()][]);
    }
}
