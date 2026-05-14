package Recursion;

import java.util.Arrays;

public class CyclicSort {
    public static void cyclicSort(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i < n){
            if (arr[i] == i){
                i++;
            }
            else {
                int idx = arr[i];
                swap(arr, arr[idx], arr[i]);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 7, 0, 4, 6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
