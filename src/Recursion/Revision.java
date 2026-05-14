package Recursion;

public class Revision {
//    print decIncreasing
    public static void printDecInc(int n){
        if (n == 0 || n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecInc(n - 1);
        System.out.print(n + " ");
    }

//  reverse a number
    public static int reverse(int n, int r){
        if (n == 0){
            return r;
        }
        return reverse(n / 10, r * 10 + n % 10);
    }

//    sum of n natural numbers
    public static int natural(int n){
        if (n == 0){
            return 0;
        }
        return n + natural(n - 1);
    }

//    a, raised to the power b
    public static int power(int a, int b){
        if (b == 0){
            return 1;
        }
        int call = power(a, b / 2);
        if (b % 2 == 0){
            return call * call;
        }
        else {
            return call * call * a;
        }
    }

//    factorial of a number
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

//    print 1 to n
    public static void print(int n){
        if (n == 0){
            return;
        }
        print(n - 1);
        System.out.println(n + " ");
    }

//    Linear search using recursion
    public static boolean exists(int[] arr, int target, int idx){
        if (idx == arr.length){
            return false;
        }
        if (arr[idx] == target){
            return true;
        }
        return exists(arr, target, idx + 1);
    }

//    printing array using recursion
    public static void printArray(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

//    reverse an array using recursion
    public static void reverse(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }
        reverse(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }

    public static void main(String[] args) {
        printDecInc(5);
        System.out.println(reverse(12345, 0));
        System.out.println(natural(5));
        System.out.println(power(3, 3));
        System.out.println(factorial(5));
        print(10);

        int[] arr = {12, 17, 19, 26, 25, 22};
        System.out.println(exists(arr, 12, 0));

        printArray(arr, 0);
        System.out.println();

        reverse(arr, 0);
    }
}
