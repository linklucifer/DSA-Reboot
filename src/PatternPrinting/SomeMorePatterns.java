package PatternPrinting;

import java.util.Scanner;

public class SomeMorePatterns {
    //    for capital
    public static void printAlphabetPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

//    for mixed
    public static void printAlphabetPattern2(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i % 2 != 0){
                    System.out.print((char) (i + 96) + " ");
                }

                else {
                    System.out.print((char) (i + 64) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        printAlphabetPattern(4);
        printAlphabetPattern2(4);
    }
}
