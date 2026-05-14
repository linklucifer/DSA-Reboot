package Recursion;

import java.util.Scanner;

public class Printing1toN {
    static int n;
    public static void print(int x){
        if (x > n){
            return;
        }
        System.out.print(x + " ");
        print(x + 1);
    }

//    another and much better way to print the number from 1 to n
    public static void printing(int n){
        if (n == 0){
            return;
        }
        printing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        print(1);

        printing(n);
    }
}
