package BinarySearch;

public class SearchInRotatedArray {
    public static int searchRotate(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if(arr[low] <= arr[mid]){   // checking if the array low to mid sorted or not
                if (arr[low] <= target && target < arr[mid]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if (arr[mid] < target && target <= arr[high]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2};
        int ans = searchRotate(arr, 10);
        System.out.println(ans);
    }
}
