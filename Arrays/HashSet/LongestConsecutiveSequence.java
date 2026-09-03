import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        longestConsecutiveSequence(arr);

    }
    public static void longestConsecutiveSequence(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }
        int cur = 0;
        int len =0;
        int maxLen =0;
        for(int num : arr){
            if(!set.contains(num -1)){
                cur = num;
                len= 1;

                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }

                maxLen = Math.max(maxLen,len);
            }
        }
        System.out.println(maxLen);
    }
    
}