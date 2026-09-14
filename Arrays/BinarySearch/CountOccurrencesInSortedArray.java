import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
          arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int last =-1;
        int first = -1;
        int low =0;
        int high = arr.length-1;
        int mid =0;

        while(low <= high){
            mid = low +(high-low)/2;
            if(arr[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(high >= 0 && arr[high] == target){
            last = high;
        }
         low =0;
         high = arr.length-1;
        while(low <= high){
            mid = low +(high-low)/2;
            if(arr[mid] >= target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low < arr.length && arr[low] == target){
            first = low;
        }
        if(first == -1 || last == -1){
            System.out.println(-1);
        }
        else{
            System.out.println(last-first+1);
        }
        
    }
}
