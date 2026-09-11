import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int current =arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            current  = arr[i];
            int prod1 = current * max;
            int prod2 = current * min;
            int newMax = Math.max(current,Math.max(prod1,prod2));
            int newMin = Math.min(current,Math.min(prod1,prod2));

            max = newMax;
            min = newMin;
            ans = Math.max(max,ans);
        }
        System.out.println(ans);
    }
}
