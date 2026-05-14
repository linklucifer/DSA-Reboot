package Sorting;

public class KthSmallest {
    public static int smallest(int[] arr, int k){
        int n = arr.length;
        for (int i = 0; i < k; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < n; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int ans = smallest(arr, 4);
        System.out.println(ans);
    }
}
