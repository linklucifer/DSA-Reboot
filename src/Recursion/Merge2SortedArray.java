package Recursion;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 60, 80, 90, 120};
        int[] b = {30, 40, 50, 70, 100, 110, 130, 140};
        int[] c = new int[a.length + b.length];
        merge(a, b, c);
        for (int num : c){
            System.out.print(num + " ");
        }

    }
}
