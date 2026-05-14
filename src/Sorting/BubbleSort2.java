package Sorting;

public class BubbleSort2 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        printArray(arr);
    }

//    sort an array is descending order using bubble sort
    public static void descendingOrder(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        printArray(arr);
    }


    public static void main(String[] args) {
//        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
//        int[] arr = {3, 1, 4, 2, 5};
        int[] arr = {7, 1, 4, 3, 8, 7};
        bubbleSort(arr);
//        descendingOrder(arr);

    }
}
