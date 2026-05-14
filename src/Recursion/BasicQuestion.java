package Recursion;

public class BasicQuestion {
    public static void print(int n){
        if (n == 0){
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }

//    Decreasing and increasing
    public static void decreasingIncreasing(int n){
        if(n == 1){
//            to make sure 1 print only once
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decreasingIncreasing(n - 1);
        System.out.print(n + " ");
    }

//    Increasing and decreasing


    public static void main(String[] args) {
//        print(5);
//        decreasingIncreasing(5);
    }
}
