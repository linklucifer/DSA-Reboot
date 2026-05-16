package PatternPrinting;

public class ShapePatterns {
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {

//            code for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

//            code for stars square
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    pyramid
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {

//            spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

//            stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Method 2 of printing pyramid.
//    It is an ultimate method, using this method you can print any pattern easily
//    In all other methods, we use maths but in this method we will use a variable who tracks the number of spaces and stars
    public static void pyramidV2(int n) {
        int numberOfSpaces = n - 1;
        int numberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= numberOfStars; k++) {
                System.out.print("* ");
            }
            numberOfSpaces--;
            numberOfStars += 2;
            System.out.println();

        }
    }

    //    printing pyramid patterns using numbers and alphabets
    public static void pyramidNumbers(int n) {
        int numberOfSpaces = n - 1;
        int numberOfNums = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= numberOfNums; k++) {
                System.out.print(i + " ");
            }
            numberOfSpaces--;
            numberOfNums += 2;
            System.out.println();
        }
    }

    //    second version of number pyramid
    public static void pyramidNumbers2(int n) {
        int numberOfSpaces = n - 1;
        int numberOfNums = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= numberOfNums; k++) {
                System.out.print(k + " ");
            }
            numberOfSpaces--;
            numberOfNums += 2;
            System.out.println();
        }
    }

    //    pyramid of Alphabets
    public static void pyramidAlphabets(int n) {
        int numberOfSpaces = n - 1, numberOfAlphabets = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= numberOfAlphabets; k++) {
                System.out.print((char) (i + 64) + " ");
            }
            numberOfSpaces--;
            numberOfAlphabets += 2;
            System.out.println();
        }
    }

    //    Second version of pyramid of alphabets
    public static void pyramidAlphabets2(int n) {
        int numberOfSpaces = n - 1, numberOfAlphabets = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= numberOfAlphabets; k++) {
                System.out.print((char) (k + 64) + " ");
            }

            numberOfSpaces--;
            numberOfAlphabets += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        rhombus(4);
//        pyramid(4);
//        pyramidV2(4);
//        pyramidNumbers(5);
//        pyramidNumbers2(5);
        pyramidAlphabets(5);
        pyramidAlphabets2(5);
    }
}
