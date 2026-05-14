package PatternPrinting;

import java.util.Scanner;

public class PrintSimplePatterns {
//    print rectangle
    public static void printRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {     // kitni line hogi
            for (int j = 1; j <= cols; j++) { // har line me kitna star hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    print square
    public static void printSquare(int sides) {
        for (int i = 1; i <= sides; i++) {
            for (int j = 1; j <= sides; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    print square of numbers
    public static void printSimpleNumberPatter(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

//    print square of alphabets using ASCII values and typecasting
    public static void printSquareAlphabet(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
//                here we typecast the data-type into char and also use ASCII values (65 = A)
                System.out.print((char)(j + 64 )+ " ");
            }
            System.out.println();
        }
    }

//    print the square of small-alphabets using ASCII values and typecasting
    public static void printSquareAlphabet2(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print((char)(j + 96) + " ");   // 97 = a
            }
            System.out.println();
        }
    }

//    print the pattern of number in square shape
    public static void printSquareNumberPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        printRectangle(rows, cols);

//        int sides = sc.nextInt();
//        printSquare(sides);

        int n = sc.nextInt();
        printSimpleNumberPatter(n);
//        printSquareAlphabet(n);
//        printSquareAlphabet2(n);
//        printSquareNumberPattern(n);
    }
}
