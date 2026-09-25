class Main{
    public static void main(String[] args){
        int[][] arr= {{1,5,7,9,11},{2,3,4,5,10},{9,10,12,14,16}};
        int n = arr.length;
        int m = arr[0].length;
        int low =arr[0][0];
        int high = arr[n-1][m-1];
        int mid= 0;

        while(low <= high){
            mid = low+(high-low)/2;
            int smallerElementsCount = countSmallerElementThenMid(arr,n,m,mid);
            int required = (m * n) / 2 + 1;
            if(smallerElementsCount < required){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(low);
    }
    public static int countSmallerElementThenMid(int[][] arr,int n,int m,int target){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int low =0;
            int high = arr[i].length-1;
            int mid = 0;
            while(low <= high){
                mid = low+(high-low)/2;
                if(arr[i][mid] <= target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            count += high+1;
        }
        return count;
    }
}
