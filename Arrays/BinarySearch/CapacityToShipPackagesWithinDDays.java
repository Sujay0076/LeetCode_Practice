class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap = Integer.MIN_VALUE;
        int maxCap =0;
        for(int num : weights){
            minCap = Math.max(num,minCap);
            maxCap += num;
        }
        int low = minCap;
        int high = maxCap;
        int mid =0;
        int sum =0;
        int requiredDays =0;
        while(low <= high){
            mid = low+(high-low)/2;
            requiredDays = calculateDays(weights,mid);
            if(requiredDays <= days){
                high = mid-1;
            }
            else{
                low =mid+1;
            }
        }
        return low;
    }
    public int calculateDays(int[] weights,int cap){
        int days =1;
        int load =0;

        for(int i=0;i<weights.length;i++){
            if(load + weights[i] > cap){
                days++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
}
