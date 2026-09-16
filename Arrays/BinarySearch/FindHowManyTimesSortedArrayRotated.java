import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    findHowManyTimesRotate(arr);
    }
    public static void findHowManyTimesRotate(int[] arr){
        int min = arr[0];
        int count =0;
        int low =0;
        int high = arr.length-1;
        int mid =0;
        while(low <= high){
            mid = low+(high-low)/2;
            if(arr[low] < arr[high]){
                if(arr[low] <= min){
                    min = arr[low];
                    count = low;
                    System.out.println(count);
                    return;
                }
            }
            else if(arr[mid] <= min){
                min = arr[mid];
                count = mid;
            }
            else if(arr[low] <= arr[mid]){
                low = mid+1;
            }
            else{
                high =mid-1;
            }
        }
        System.out.println(count);
    }
}
