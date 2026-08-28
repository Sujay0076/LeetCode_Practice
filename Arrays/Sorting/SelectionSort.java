// Selection Sort — Problem Statement

// Given an array of integers, sort the array in ascending order using the Selection Sort algorithm.

// In Selection Sort, repeatedly find the minimum element from the unsorted portion of the array and place it at the beginning of that portion.

// Example
// Input:  [64, 25, 12, 22, 11]

// Output: [11, 12, 22, 25, 64]

// Constraints:

// The array may contain positive, negative, or duplicate integers.
// Sort the array in-place without using another array.

package sortings.com;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(i,min,arr);
        }
    }
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}

