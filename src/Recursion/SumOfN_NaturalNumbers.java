package Recursion;

public class SumOfN_NaturalNumbers {
    public static int natural(int n){
        return n * (n + 1) / 2;
    }

//    using recursion
    public static int sumNatural(int n){
        if (n == 0){
            return 0;
        }
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(natural(4));

        int ans = sumNatural(4);
        System.out.println(ans);
    }
}
