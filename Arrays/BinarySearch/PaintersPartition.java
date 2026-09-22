import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int painters = sc.nextInt();
        int min = Integer.MIN_VALUE;
        int max = 0;
        for(int num : arr){
            min = Math.max(num,min);
            max += num;
        }
        
        int low = min;
        int high = max;
        int mid =0;
        int allocatedPainters = 0;

        while(low <= high){
            mid = low+(high-low)/2;
            allocatedPainters = countAllocatedPainters(arr,mid);
            if(allocatedPainters > painters){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(low);
    }
    public static int countAllocatedPainters(int[] arr,int mid){
        int count =1;
        int boards =arr[0];
        for(int i=1;i<arr.length;i++){
            if(boards + arr[i] <= mid){
                boards += arr[i];
            }
            else{
                count++;
                boards = arr[i];
            }
        }
        return count;
    }
}
