package Recursion;

public class FirstMissingPositive {
    public static int missing(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i < n){
            if (arr[i] <= 0 || arr[i] > n || arr[i] == i + 1 || arr[i] == arr[arr[i] - 1]){
                i++;
            }
            else {
                swap (arr, i, arr[i] - 1);
            }
        }
        for (i = 0; i < n; i++){
            if (arr[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }

//    swap
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = missing(arr);
        System.out.println(ans);
    }
}
