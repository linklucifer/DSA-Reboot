package Recursion;

import java.util.Arrays;

public class MissingANumber {
    public static int missingNum(int[] arr) {
        int n = 1 + arr.length;   // index from 1 to n (basically 1-based indexing)
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, idx, i);
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n;
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int ans = missingNum(arr);
        System.out.println(ans);
    }
}
