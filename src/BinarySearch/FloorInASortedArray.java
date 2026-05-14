package BinarySearch;

public class FloorInASortedArray {
    public static int floor(int[] arr, int x){
        int low = 0, high = arr.length - 1;
        int index = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x){
                index = mid;
                low = mid + 1;  // for the last occurrence
            }

            else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 19, 20};
        int ans = floor(arr, 11);
        System.out.println(ans);
    }
}
