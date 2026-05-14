package Recursion;

public class InversionCount {
//    brute force
    public static int inversion(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

//    with the help of mergesort
    static int count;   // declaring a global count variable so that I can access it multiple times
    public static int countInversion(int[] arr){
        count = 0;
        mergeSort(arr);
        return count;
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if (n == 1){
            return;
        }

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

//        populate the new arrays
        int idx = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++){
            b[i] = arr[idx++];
        }

        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                c[k++] = a[i++];
            }
            else {   // a[i] > b[j]
                count = count + (a.length -i);
                c[k++] = b[j++];
            }
        }
        while (i < a.length){
            c[k++] = a[i++];
        }
        while (j < b.length){
            c[k++] = b[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversion(arr));

        int ans = countInversion(arr);
        System.out.println(ans);
    }
}
