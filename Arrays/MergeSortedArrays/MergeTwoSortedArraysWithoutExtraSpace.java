import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }

        mergeSortedArrays(arr1, arr2);
    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2) {

        int i = arr1.length - 1;
        int j = 0;

        while (i >= 0 && j < arr2.length && arr1[i] > arr2[j]) {

            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
         
            int value = arr1[i];
            int k = i;
            while (k > 0 && arr1[k - 1] > value) {
                arr1[k] = arr1[k - 1];
                k--;
            }

            arr1[k] = value;
   
            value = arr2[j];
            k = j;
            while (k < arr2.length - 1 && arr2[k + 1] < value) {
                arr2[k] = arr2[k + 1];
                k++;
            }

            arr2[k] = value;

            i--;
            j++;
        }

        for (int num : arr1) {
            System.out.print(num + " ");
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
