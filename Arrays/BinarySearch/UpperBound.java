import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        upperBound(arr,x);
    }
    public static void upperBound(int[] arr,int x){
            int low=0;
            int high=arr.length-1;
            int mid =0;
    
            while(low <= high){
                mid = low +(high-low)/2;
                if(arr[mid] > x){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            System.out.println(low);
    }
}
