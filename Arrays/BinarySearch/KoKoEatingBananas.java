class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =piles[0];
        for(int num : piles){
            max = Math.max(max,num);
        }

        int low =1;
        int high = max;
        int mid =0;
        long hours =0;

        while(low <= high){
            mid = low+(high-low)/2;
            hours =0;
            for(int num : piles){
                hours += Math.ceil((double)num/mid);
            }
            if(hours > h){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;

    }
}
