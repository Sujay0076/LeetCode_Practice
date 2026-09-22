import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int stations = sc.nextInt();
        Arrays.sort(arr);

        double low = 0;
        double high = arr[arr.length-1]-arr[0];
        double mid =0;
        int gasStationCount  = 0;
        
       for(int i=1;i<100;i++){
            mid = low+(high-low)/2;
            gasStationCount = findMaxGapStations(arr,mid);
            if(gasStationCount > stations){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        System.out.print(low);
    }
    public static int findMaxGapStations(int[] arr,double mid){
        int required =0;
        for(int i=1;i<arr.length;i++){
            int gap = arr[i] - arr[i-1];
            required += (int)Math.ceil(gap/mid)-1;
        }
        return required;
    }
}
