package sortings;
import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {3,1,2,4,1,5,6,2,4};

        mergeSort(0,arr.length-1,arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void mergeSort(int low,int high,int[]arr) {
        if(low == high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(low, mid, arr);
        mergeSort(mid+1, high, arr);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int left =low;
        int right = mid+1;
        List<Integer> list = new ArrayList<>();
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

