public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,6,4,2,6};

        secondLargestNumber(arr);
    }
    public static void secondLargestNumber(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2 && num != max1){
                max2 = num;
            }
        }
        System.out.println(max2);
    }
    
}

