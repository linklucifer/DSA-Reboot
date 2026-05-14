package Sorting;

public class BubbleSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //    naive bubble sort
    public static void bSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//    a slightly better bubble sort solution
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//    optimized bubble sort
    public static void optimizedBubbleSort(int[] arr){
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
    

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
//        int n = arr.length;
        printArray(arr);

/*        for (int i = 0; i < n - 1; i++) {
//            we can improve this code just by adding n - 1 - i into the code. Because in each pass the largest element will be sort and placed at it's
//            correct place so we don't need to check and swap them again and again. If they are already sorted then leave them and sort the rests.
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
 */
//        bSort(arr);
        bubbleSort(arr);
        printArray(arr);

    }
}
