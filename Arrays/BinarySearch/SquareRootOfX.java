class Solution {
    public int mySqrt(int x) {
        int low =1;
        int high = x;
        int mid = 0;
        while(low <= high){
            mid = low+(high-low)/2;
            if((long)mid * (long)mid == x){
                return mid;
            }
            else if((long)mid*(long)mid > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }
}
