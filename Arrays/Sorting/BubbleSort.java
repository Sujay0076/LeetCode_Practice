// Problem Statement:

// Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm.

// In Bubble Sort, repeatedly compare adjacent elements and swap them if they are in the wrong order. After each pass, the largest unsorted element moves to the end of the unsorted portion.

// Example
// Input:  [5, 3, 8, 1, 2]

// Output: [1, 2, 3, 5, 8]

// Your task: Implement Bubble Sort in IntelliJ and sort the array in-place.
import java.util.*;

class BubbleSort{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    bubbleSort(arr);
    for(int num : arr){
      System.out.print(num+" ");
    }
  }
  public static void bubbleSort(int[] arr){
    for(int i=arr.length-1;i>0;i--){
      for(int j=0;j<i;j++){
        if(arr[j+1] < arr[j]){
          swap(j,j+1,arr);
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

















    
    
