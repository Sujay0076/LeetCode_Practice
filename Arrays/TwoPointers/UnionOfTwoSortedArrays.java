import java.util.*;
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
       int[] arr1 = {1, 2, 4, 5};
       int[] arr2 = {2, 3, 5, 6};
       List<Integer> union = unionOfArrays(arr1,arr2);
       for(int num : union){
        System.out.print(num+" ");
       }
    }
    public static List<Integer> unionOfArrays(int[] a1,int[] a2){
        int i=0;
        int j =0;
        List<Integer> list = new ArrayList<>();
        while(i < a1.length && j < a2.length){
            if(a1[i] < a2[j]){
                list.add(a1[i]);
                i++;
               
            }
            else if(a1[i] == a2[j]){
                list.add(a1[i]);
                i++;
                j++;
            }
            else{
                list.add(a2[j]);
                j++;
            }
        }
        while(i < a1.length){
            list.add(a1[i]);
            i++;
        }
        while(j < a2.length){
            list.add(a2[j]);
            j++;
        }
        return list;
    }

    
}

