package BinarySearch;

public class MaxCountPosNegInt {
    public static int countPosNeg(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n - 1;

//        for the negative count
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] >= 0){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        int negCount = low;

        low = 0;
        high = n - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] <= 0){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        int posCount = n - low;

        return Math.max(posCount, negCount);
    }

    public static void main(String[] args) {
        int[] arr = {-5, -4, -3, -1, 0, 0, 0, 1, 2, 6, 8, 9, 10};
        int ans = countPosNeg(arr);
        System.out.println(ans);
    }
}
