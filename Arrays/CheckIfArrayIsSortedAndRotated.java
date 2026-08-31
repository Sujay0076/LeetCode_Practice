class CheckIfArrayIsSortedAndRotated{
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        // int[] arr = {2,1,3,4};
        System.out.println(isSortedAndRotated(arr));
    }
    /** 
     * This was brute force approach of O(n square)
     * 
    public static boolean isSortedAndRotated(int[] arr){
        boolean sorted =false;
        int count =0;

        while(!sorted){
            int temp = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            count++;

            if(checkArraySorted(arr)){
                sorted = true;
            }
            if(count > arr.length-1 && !sorted){
                break;
            }
            System.out.println("count "+count);
        }
        return sorted;

    }
    public static boolean checkArraySorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(!(arr[i] >= arr[i-1])){
                return false;
            }
        }
        return true;
    }
        
    */
    public static boolean isSortedAndRotated(int[] arr){
        int breakCond = 0;
        for(int i=1;i<arr.length;i++){
            if(!(arr[i] >= arr[i-1])){
                breakCond++;
            }
            if( breakCond > 1){
                return false;
            }
        }

        if(breakCond == 0){
            return true;
        }else if(arr[0] > arr[arr.length-1]){
            return true;
        }
        else{
            return false;
        }
    }
}
