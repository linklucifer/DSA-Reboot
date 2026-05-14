package Sorting;

public class MoveZeros {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void moveZeros(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){
                if (arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void main(String[] args){
        int[] arr = {3, 2, 0, 6, 0, 1, 0, 9, 0, 2, 0};
        moveZeros(arr);
    }
}
