package Recursion;

import java.util.Scanner;

public class A_RaisedToThePowerB {
//    A, raised to the power B using for loop
    public static int powerForLoop(int a, int b){
        int ans = 1;
        for (int i = 1; i <= b; i++){
            ans = ans * a;
        }
        return ans;
    }

//    using recursion
    public static int powerAtoB(int a, int b){
        if(b == 0){
            return 1;
        }
        return a * powerAtoB(a, b - 1);
    }

//    using logarithmic time complexity
    public static int power(int a, int b){
        if (b == 0){
            return 1;
        }
        int call = power(a, b / 2);
        if (b % 2 == 0){
//            in this scenario, I called the same function two times which made this code pathetic, instead I take a call viable
//            return power(a, b / 2) * power(a, b / 2);
            return call * call;
        }
        else {
//            return a * power(a, b / 2) * power(a, b / 2);
            return a * call * call;
        }
    }

    public static void main(String[] args) {
        int ans = powerForLoop(3, 3);
        System.out.println(ans);

        int recAns = powerAtoB(3, 3);
        System.out.println(recAns);

        int logAns = power(3, 4);
        System.out.println(logAns);

//        or we can take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power " + b + " is " + power(a, b));
    }
}
