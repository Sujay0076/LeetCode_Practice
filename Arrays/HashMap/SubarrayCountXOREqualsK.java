import java.util.*;
class SubarrayCountXorEqualsK{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int k =sc.nextInt();
    subarrayXorEqualsK(arr,k);
  }
  public static void subarrayXorEqualsK(int[] arr,int k){
    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int count=0;
    int xor =0;
    for(int num : arr){
      xor ^= num;
      if(map.containsKey(xor ^ k)){
        count += map.get(xor ^ k);
      }
      map.put(xor,map.getOrDefault(xor,0)+1);
    }
    System.out.println(count);
  }
}
      
