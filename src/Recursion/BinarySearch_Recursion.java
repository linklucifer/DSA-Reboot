package Recursion;

public class BinarySearch_Recursion {
    public static int helper(int[] arr, int target, int low, int high){
        if (low > high){
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return helper(arr, target, low, mid - 1);
        }
        else {
            return helper(arr, target, mid + 1, high);
        }
    }

    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        return helper(arr, target, 0, n - 1);
    }
    public static void main(String[] args) {
//        int[] arr = {0, 2, 4, 9, 12, 13, 22};
        int[] arr = {1, 3, 7, 9, 13, 17};
        System.out.println(binarySearch(arr, 9));
    }
}
