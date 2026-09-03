import java.util.*;

class LeadersInArray{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> leaders = getLeaders(arr);
        for(int num : leaders){
            System.out.print(num+" ");
        }
    }
    public static List<Integer> getLeaders(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;

    }
}