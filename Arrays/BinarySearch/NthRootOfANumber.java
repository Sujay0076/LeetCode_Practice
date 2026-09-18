import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int low = 1;
        int high=n;
        int mid =0;
        while(low <= high){
            mid = low+(high-low)/2;
            if((Math.pow(mid,m)) == n){
                System.out.println(mid);
                return;
            }
            else if(Math.pow(mid,m) > n){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(-1);
    }
}
