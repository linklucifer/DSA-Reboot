package BinarySearch;

public class BinarySearchBegins {
    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return -1;
    }

//    binary search on descending order array
    public static int descendingSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {-76, -4, 9, 28, 47, 49, 510, 615, 9911, 99999};
//        int ans = search(arr, 615);

        int[] arr2 = {100, 78, 52, 31, 12, 1, 0};
        int ans = descendingSearch(arr2, 12);
        System.out.println(ans);
    }
}
