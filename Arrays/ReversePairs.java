class Solution {
    int count =0;
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return count;
    }
    public void mergeSort(int[]arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int l = low;
        int r = mid+1;
        int right = mid+1;
        List<Integer> list = new ArrayList<>();
        while(l <= mid && r <= high){
             if((long)arr[l] > 2 *(long)arr[r]){
                count += mid - l +1;
                r++;
             }else{
                l++;
             }
        }
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }
}
