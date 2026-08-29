public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        quickSort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void quickSort(int[] arr,int low,int high) {
        if(low < high){
            int partition = partition(low,high,arr);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }

    }
    public static int partition(int low,int high,int[] arr){
        int pivot = arr[low];
        int i=low,j=high;

        while(i < j){
            while(i<= high-1 && arr[i] <= pivot){
                i++;
            }
            while(j >= low+1 && arr[j] > pivot){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    
}

