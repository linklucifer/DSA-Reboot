package Recursion;

public class LinearSearch_Recursion {
    public static boolean exists(int[] arr, int target, int idx){
        if (idx == arr.length){
            return false;
        }
        if (arr[idx] == target){
            return true;
        }
        return exists(arr, target, idx + 1);
    }
    public static void main(String[] args){
        int[] arr = {12, 17, 19, 26, 25, 22};
        System.out.println(exists(arr, 6, 0));
    }
}
