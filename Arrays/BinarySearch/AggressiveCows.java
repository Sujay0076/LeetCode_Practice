import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] stalls = new int[n];
        for(int i=0;i<stalls.length;i++){
            stalls[i] = sc.nextInt();
        }
         int cows = sc.nextInt();

        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length-1] - stalls[0];
        int mid=0;
        int allowedCows =0;

         while(low <= high){
             mid = low+(high-low)/2;
             allowedCows = isMaxMinGap(cows,stalls,mid);
             if(allowedCows >= cows){
                 low = mid+1;
             }
             else{
                 high = mid-1;
             }
         }
        System.out.println(high);
    }
    public static int isMaxMinGap(int cows,int[] stalls,int gap){
        int cntCows = 1;
        int last = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - last >= gap){
                cntCows++;
                last = stalls[i];
            }
        }
        return cntCows;
    }
}
