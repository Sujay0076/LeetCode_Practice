public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,1,8};
        largestElement(arr);
    }
    public static void largestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max,num);
        }
        System.out.println(max);
    }
}

