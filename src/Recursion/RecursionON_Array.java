package Recursion;

public class RecursionON_Array {
//    printing an array using recursion
    public static void printArray(int[] arr, int idx){
        int n = arr.length;
        if (idx == n){
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

//    printing array in reverse order
    public static void rev(int[] arr, int idx){
        if (idx < 0){
            return;
        }
        System.out.print(arr[idx] + " ");
        rev(arr, idx - 1);
    }

//    another and best way to print the array in reverse order
    public static void reverse(int[] arr, int idx){
        int n = arr.length;
        if (idx == n){
            return;
        }
        reverse(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }


    public static void main(String[] args){
        int[] arr = {12, 17, 19, 16, 25, 30, 18, 14};
        printArray(arr, 0);
        System.out.println();

//        rev
        int n = arr.length;
        rev(arr, n - 1);
        System.out.println();

//        reversing an array
        reverse(arr, 0);
    }
}