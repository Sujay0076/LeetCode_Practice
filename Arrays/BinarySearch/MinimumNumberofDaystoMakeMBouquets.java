class Solution {
    public int minDays(int[] bloomDays, int m, int k) {
        if((long) m * k > bloomDays.length){
            return -1;
        }
        int min =bloomDays[0];
        int max = bloomDays[1];
        int bouque = 0;
        int flowers =0;

        for(int num : bloomDays){
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        int low =min;
        int high = max;
        int mid=0;
        while(low <= high){
            mid = low+(high-low)/2;
            flowers=0;
            bouque=0;
            for(int bloomDay : bloomDays){
                if(mid >= bloomDay){
                    flowers++;
                    if(flowers == k){
                        bouque++;
                        flowers=0;
                    }
                }
                else{
                    flowers=0;
                }
            }
            if(bouque >= m){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
