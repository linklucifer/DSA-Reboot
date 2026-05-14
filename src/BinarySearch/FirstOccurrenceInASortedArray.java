package BinarySearch;

import java.util.ArrayList;

public class FirstOccurrenceInASortedArray {
    public static int occurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                index = mid;
                high = mid - 1;
            }

            else if(arr[mid] > target){
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return index;
    }

//    first and last occurrence in a sorted array
    public static ArrayList<Integer> firstLastOccurrence(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > target){
                high = mid - 1;
            }

            else if(arr[mid] < target){
                low = mid + 1;
            }

            else {
                index = mid;
                high = mid - 1;
            }
        }
        ans.add(index);
        low = 0;
        high = arr.length - 1;
        index = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > target){
                high = mid - 1;
            }

            else if(arr[mid] < target){
                low = mid + 1;
            }

            else {
                index = mid;
                low = mid + 1;
            }
        }

        ans.add(index);
        return ans;
    }

    

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 11};
        int ans = occurrence(arr, 5);
//        System.out.println(ans);
        System.out.println(firstLastOccurrence(arr, 5));
    }
}
