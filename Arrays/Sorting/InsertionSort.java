// Insertion Sort — Problem Statement

// Given an array of integers, sort the array in ascending order using the Insertion Sort algorithm.

// In Insertion Sort, build the sorted portion of the array one element at a time. Take the current element and insert it into its correct position within the already-sorted portion by shifting larger elements to the right.

// Example
// Input:  [5, 3, 8, 1, 2]

// Output: [1, 2, 3, 5, 8]

import java.util.*;

class InsertionSort{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<arr.length;i++){
       arr[i] = sc.nextInt();
     }
    insertionSort(arr);

    for(int num : arr){
      System.out.print(num+" ");
    }

  }
  public static void insertionSort(int[] arr){

     for(int i=1;i<arr.length;i++){
       for(int j=i;j>0;j--){
         if(arr[j] < arr[j-1]){
            swap(j,j-1,arr);
           }
         }
       }
    }
public static void swap(int i,int j,int[] arr){
      int temp = arr[i];
       arr[i] = arr[j];
        arr[j] = temp;
}

}
