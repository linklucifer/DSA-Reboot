package Recursion;

import java.util.Scanner;

// recursion is something in which, functions calling itself.
public class Recursion_Begins {
    public static void aditya(int n){
        if (n == 5) return;
        System.out.println("Anushka");
//        this is how a recursion looks like
        aditya(n + 1);
    }

//    printing numbers in reverse order
    public static void print(int n){
//        we have to make sure that, there should be a break point in recursion. Otherwise, it will go in infinite loop
        if (n == 0){
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

//    printing number from 1 to n
    public static void num(int x, int n){
        if (x > n){
            return;
        }
        System.out.println(x);
        num(x + 1, n);
    }

    public static void main(String[] args) {
//        aditya(1);
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(n);
//        num(1, n);

        print(5);
    }
}
