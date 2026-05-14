package BinarySearch;

public class SquareRoot {
    //    brute force approach
    public static int sqrt(int n) {
        int root = 1;
        for (int i = 1; i < n; i++) {
            if (i * i > n) {
                break;
            }
            root = i;
        }
        return root;
    }

//    using binary search (optimize solution):
    public static int floorSqrt(int n){
        int low = 0;
        int high = n;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (mid * mid == n){
                return mid;
            }
            else if(mid * mid > n){
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int ans = sqrt(4);
        System.out.println(ans);

        int ans2 = floorSqrt(15);
        System.out.println(ans2);
    }
}
