package BinarySearch;

/* Single among doubles in a sorted array: Given a sorted array. Find the element that appears only once in the array. All other elements
* appears exactly twice. */

public class FindOnce {
    public static int findOnce(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
                return arr[mid];
            }

            int firstOcc = mid, secondOcc = mid;
            if (arr[mid - 1] == arr[mid]){
                firstOcc = mid - 1;
            }
            else{
                secondOcc = mid + 1;
            }

            int leftCount = firstOcc - low;
            int rightCount = high - secondOcc;
            if (leftCount % 2 == 0){
                low = secondOcc + 1;
            }
            else {
                high = firstOcc - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = findOnce(arr);
        System.out.println(ans);
    }
}
