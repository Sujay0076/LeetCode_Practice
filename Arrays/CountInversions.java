import java.util.*;
class Main {
     static int count =0;
    public static void main(String[] args) {
        int[] arr= {5,3,2,4,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(count);
    }
   public static void mergeSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();
        int left =low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                    right++;
                count += mid-left+1;
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
        for(int i=low;i<= high;i++){
            arr[i] = list.get(i-low);
        }
    }
}
