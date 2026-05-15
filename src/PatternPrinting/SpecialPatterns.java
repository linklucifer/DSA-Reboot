package PatternPrinting;
// this file is all about hollow shapes

public class SpecialPatterns {
//    hollow rectangle
    public static void hollowRec(int row, int col){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

//    star plus
    public static void starPlus(int n){
        int mid = n / 2 + 1 ;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == mid || j == mid){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

//    star cross
    public static void starCross(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j || i + j == n + 1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
//        hollowRec(4, 8);
//        starPlus(5);
        starCross(5);
    }
}
