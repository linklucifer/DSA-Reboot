package BinarySearch;

public class MountainArraySearch {
    public static int searchInMountain(int[] arr) {
        int low = 1, high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1]) {
                return mid;
            }

            else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {-1, 0, 1, 2, 5, 6, 8, 6, 3};
        int[] arr = {0, 1, 0};
        int ans = searchInMountain(arr);
        System.out.println(ans);
    }
}
