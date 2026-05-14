package Recursion;

public class Factorial {
    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

//    using, for-loop
    public static int factorial(int n){
        int ans = 1;
        if(n == 0 || n == 1){
            return 1;
        }
        for (int i = 2; i <= n; i++){
            ans = ans * i;
        }
        return ans;
    }

//    a, raised to the power b
    public static int power(int a, int b){
        int ans = 1;
        for (int i = 1; i <= b; i++){
            ans = ans * a;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);

        int fact = factorial(0);
        System.out.println(fact);

        int answer = power(3, 3);
        System.out.println(answer);
    }
}