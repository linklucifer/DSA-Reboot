package Sorting;

import java.util.Arrays;

// solving this question using in-built sorting
public class TwoSum {
    public static boolean check2Sum(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return true;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        System.out.println(check2Sum(arr, 5));
    }
}
