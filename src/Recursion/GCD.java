package Recursion;

public class GCD {
    public static int gcdWithForLoop(int x, int y){
        int hcf = 1;
        for (int i = 2; i <= Math.min(x, y); i++){
            if (x % i == 0 && y % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }

//    same approach with little changes and optimization
    public static int gcdWithForLoop2(int a, int b){
        for (int i = Math.min(a, b); i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

//    With recursion
    public static int gcdRec(int a, int b){
        if (a == 0){
            return b;
        }
        return gcdRec(b % a, a);
    }

//    to make the value of, a, smaller than b, we can make a helper function
    public static int gcdRecHelper(int a, int b){
        return helper(Math.min(a, b), Math.max(a, b));
    }

//    a helper function who take care of a and b
    public static int helper(int a, int b){
        if (a == 0){
            return b;
        }
        return gcdRecHelper(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcdWithForLoop(20, 28));
        System.out.println(gcdWithForLoop2(20, 28));
        System.out.println(gcdRec(20, 28));

        System.out.println(gcdRecHelper(48, 96));
    }
}
