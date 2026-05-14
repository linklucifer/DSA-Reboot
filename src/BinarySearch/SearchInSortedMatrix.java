package BinarySearch;

public class SearchInSortedMatrix {
    public static boolean searchMatrix(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            int midRow = mid / cols;
            int midCol = mid % cols;
            if (arr[midRow][midCol] == target){
                return true;
            }

            else if(arr[midRow][midCol] < target){
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 6, 12, 32},
                {38, 41, 47, 49, 55},
                {67, 68, 75, 76, 81},
                {84, 89, 91, 92, 98}
        };
        System.out.println(searchMatrix(arr, 100));
    }
}
