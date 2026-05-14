package Sorting;

public class CheckSorted {
//    check if an array is sorted
    public static boolean check(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 6, 8, 2, 9, 4};
        System.out.println(check(arr));
    }
}
