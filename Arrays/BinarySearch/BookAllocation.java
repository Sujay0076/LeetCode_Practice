import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int students = sc.nextInt();

        int min = Integer.MIN_VALUE;
        int max =0;
        for(int num : arr){
            min = Math.max(min,num);
            max += num;
        }
        int low = min;
        int high = max;
        int mid = 0;
        int allocatedStudents = 0;

        while(low <= high){
            mid = low+(high-low)/2;
            allocatedStudents = countStudents(arr,mid);
            if(allocatedStudents > students){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(low);
    }
    public static int countStudents(int[] arr,int mid){
        int count =1;
        int lastStudent = arr[0];
        int countPages =arr[0];
        for(int i=1;i<arr.length;i++){
            if(countPages + arr[i] <= mid){
                countPages += arr[i];
            }
            else{
                count++;
                countPages = arr[i];
            }
        }
        return count;
    }
    
}
