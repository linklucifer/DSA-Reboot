package Recursion;

public class LCM {
    public static int gcd(int a, int b){
        if (a == 0){
            return b;
        }

        return gcd(b % a, a);
    }

//    LCM code
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(20, 28));
    }
}