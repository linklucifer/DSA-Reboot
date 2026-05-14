package Recursion;

public class Reverse {
//    reversing a number using recursion with void-type
    public static void reverse1(int n, int r){
        if (n == 0){
            System.out.println(r);
            return;
        }
        reverse1(n / 10, r * 10 + n % 10);
    }

//    int type
    public static int reverse2(int n, int r){
        if (n == 0){
            return r;
        }
        return reverse2(n / 10, r * 10 + n % 10);
    }

    public static void main(String[] args) {
        int n = 9876;
//        int r = 0;
//        while (n != 0){
//            r = r * 10;
//            r = r + (n % 10);
//            n = n / 10;
//        }
//        System.out.println(r);

        reverse1(n, 0);

        System.out.println(reverse2(n, 0));
    }
}
