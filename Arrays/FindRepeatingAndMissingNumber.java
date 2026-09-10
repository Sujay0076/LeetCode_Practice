import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4};
        int n = arr.length;
        long s = (long)(n * (n+1))/2;
        long sn =0;
        long s2 = (long)(n * (n+1)* (2 * n+1))/6;
        long s2n =0;
        for(int i=0;i<n;i++){
            sn += (long)arr[i];
            s2n += (long)arr[i] * (long)arr[i];
        }
        long val1 = s - sn;
        long val2 = s2 - s2n;
        val2 = val2/val1;
        long x = (val1+val2)/2;
        long y = x- val1;
        System.out.println(x+" "+y); 
    }
}
