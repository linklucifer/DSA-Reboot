package BinarySearch;

public class RotatedSearch {
    public static int search(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }

            else if(arr[low] <= arr[mid]){
                if (arr[low] <= target && target < arr[low]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            else {
                if (arr[mid] <= target && target < arr[high]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2};
        int ans = search(arr, 10);
        System.out.println(ans);
    }
}
