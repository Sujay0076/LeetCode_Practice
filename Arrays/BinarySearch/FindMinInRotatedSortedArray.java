class Solution {
    public int findMin(int[] arr) {
        int min = arr[0];
        int low =0;
        int high = arr.length-1;
        int mid =0;

        while(low <= high){
            mid = low +(high-low)/2;
            if(arr[low] < arr[high]){
                min = Math.min(arr[low],min);
                return min;
            }
            min = Math.min(min,arr[mid]);
            if(arr[low] <= arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return min;
    }
}
