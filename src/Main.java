import javax.xml.transform.stax.StAXResult;

public class Main {
//    reverse a number
    public static int reverse(int n,int r){
        if (n == 0){
            System.out.print(r);
            return r;
        }
        return reverse(n / 10, r * 10 + n % 10);
    }

//  reverse 2
    public static int reverse2(int n, int r){
        if (n == 0){
            return r;
        }
        return reverse2(n / 10, r * 10 + n % 10);
    }

// linear search
    public static boolean search(int[] arr, int target, int idx){
        if (idx == arr.length){
            return false;
        }
        if (arr[idx] == target){
            return true;
        }
        return search(arr, target, idx + 1);
    }

    public static int linearSearch(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx == n){
            return -1;
        }
        if (arr[idx] == target){
            return idx;
        }
        return linearSearch(arr, target, idx + 1);
    }

//    binary search
    public static int helper(int[] arr, int target, int low, int high){
        if (low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return helper(arr, target, low, mid - 1);
        }
        else {
            return helper(arr, target, mid + 1, high);
        }
    }

//    public static int binarySearch(int[] arr,int target){
//        int n = arr.length;
//        return helper(arr, target, 0, n - 1);
//    }

//    print an array
    public static void printArray(int[] arr, int idx){
//        int n = arr.length;
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

//    reverse
    public static void reverse(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        reverse(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }

//    a raised to the power b
    public static int power(int a, int b){
        if (b == 0){
            return 1;
        }
        int call = power(a, b / 2);
        if (b % 2 == 0){
            return call * call;
        }
        else{
            return call * call * a;
        }
    }

    public static int power2(int a, int b){
        if (b == 0){
            return 1;
        }
        return a * power2(a, b - 1);
    }

    public static int power3(int a, int b){
        int ans = 1;
        for (int i = 1; i <= b; i++){
            ans = ans * a;
        }
        return ans;
    }

    public static int natural(int n){
        return n * (n + 1) / 2;
    }

    public static int naturalSum(int n){
        if (n == 0){
            return 0;
        }
        return n + natural(n - 1 );
    }

    public static void main(String[] args) {
/*        int n = 1234356;
        reverse(n, 0);
        System.out.println();
        System.out.println(reverse2(n, 0));

//        linear search
        int[] arr = {1, 12, 23, 14, 55, 60};
        System.out.println(search(arr, 12, 0));

//        binary search
        int[] arr2 = {1, 12, 15, 25, 31, 43, 90};
//        System.out.println(binarySearch(arr2, 31));
        System.out.println(helper(arr2, 31, 0, arr2.length - 1));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 12};
        printArray(arr3, 0);
        System.out.println();
        reverse(arr3, 0); */

        int ans = power(3,3);
        System.out.println(ans);

        System.out.println(power2(3, 3));
        System.out.println(power3(3, 3));

        int[] arr = {12, 23, 20, 21, 1, 0, 2};
        System.out.println(linearSearch(arr, 0, 0));
        System.out.println(natural(5));
    }
}