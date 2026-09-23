import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr1 ={2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k =6;
        if(arr1.length > arr2.length){
            int[] temp = arr1;
            arr1 =arr2;
            arr2 = temp;
        }

        int low = Math.max(0,k-arr2.length);
        int high = Math.min(k,arr1.length);
        int mid1 =0;
        int mid2=0;

        while(low <= high){
            mid1 = low+(high-low)/2;
            mid2 = k-mid1;

            int l1 = mid1 == 0 ? Integer.MIN_VALUE:arr1[mid1-1];
            int r1 = mid1 == arr1.length ? Integer.MAX_VALUE:arr1[mid1];
            int l2 = mid2==0 ? Integer.MIN_VALUE : arr2[mid2-1];
            int r2 = mid2 == arr2.length ? Integer.MAX_VALUE : arr2[mid2];

            if(l1 > r2){
                high = mid1-1;
            }
            else if(l2 > r1){
                low = mid1+1;
            }
            else{
                System.out.println(Math.max(l1,l2));
                return;
            }
        }
    }
}
