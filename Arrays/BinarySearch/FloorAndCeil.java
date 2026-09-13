import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int low =0;
        int high = arr.length-1;
        int mid =0;
        int x =sc.nextInt();
        int floor =0;
        int ceil =0;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[mid] <= x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if (high < 0) {
            floor = -1;
        } else {
            floor = arr[high];
        }
        
        if (low >= arr.length) {
            ceil = -1;
        } else {
            ceil = arr[low];
        }
        System.out.println(floor+" "+ceil);
        
    }
}
