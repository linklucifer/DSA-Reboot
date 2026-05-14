package Sorting;

public class InsertionSort {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args){
        int[] arr = {4, 1, 7, 3, 9, 2, 0, 8};
        insertionSort(arr);
    }
}
