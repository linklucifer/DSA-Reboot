package Sorting;

public class SelectionSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //    selecting smallest
    public static void selectionSmallestSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
//            swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArray(arr);
    }

    public static void selectionSortAscendingUsingLargest(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = 0;

            // find largest in unsorted part (0 → n-i-1)
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // swap with last unsorted position
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        printArray(arr);
    }

    //    descending order
    public static void selectionLargestSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // swapping
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        printArray(arr);
    }

    public static void main(String[] args) {
//        int[] arr = {5, -2, 6, 7, 0, 7, 2};
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        selectionSmallestSort(arr);
        selectionSortAscendingUsingLargest(arr);

//        descending order
        selectionLargestSort(arr);
    }
}
