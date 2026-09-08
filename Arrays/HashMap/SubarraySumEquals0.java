import java.util.*;
class SubarraySumEquals0{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    subarraySumEquals0(arr);
  }
  public static void subarraySumEquals0(int[] arr){
    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,-1);
    int sum =0;
    int maxLen =-1;
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
      if(map.containsKey(sum)){
        maxLen = Math.max(maxLen,i-map.get(sum));
      }
      else{
        map.put(sum,i);
      }
    }
  }
