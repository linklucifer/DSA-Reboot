package Recursion;

public class Stairs {
//    solving this question using recursion, but best way to do it is: DP (Dynamic Programming)
    public static int stairCase(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return stairCase(n - 1) + stairCase(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(stairCase(5));
    }
}
