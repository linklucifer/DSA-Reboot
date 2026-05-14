package Recursion;

public class MergeSort {
    public static void mergeSort(int[] arr){
//        step 1: create 2 new empty arrays of size n / 2 each
        int n = arr.length;

//        base case
        if (n == 1){  // array of length 1 will be already sorted
            return;
        }
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

//        step 2: copy-paste arr into a and b (populate the new arrays)
        int idx = 0; // idx will travel on main arr
//        populate a
        for (int i = 0; i < a.length; i++){
            a[i] = arr[idx];
            idx++;
        }

//        populate b
        for (int i = 0; i < b.length; i++){
            b[i] = arr[idx];
            idx++;
        }

//        Step 3: Magic (recursion)
        mergeSort(a);
        mergeSort(b);

//        merge all the subarrays into a sorted array
        merge(a, b, arr);
    }

//    merging the subarrays into a sorted way
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
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
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3, 0, -3};
        mergeSort(arr);
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
