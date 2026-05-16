package PatternPrinting;

public class DiamondShape {
    //    upper part of the diamond is as same as pyramid
    public static void diamond(int n) {
        int numberOfSpaces = n - 1, numberOfStars = 1;
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

        //    lower part is the mirror of pyramid
        numberOfSpaces = 1;
        numberOfStars = 2 * n - 3;

//        One line less than before will be printed in the lower part
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= numberOfStars; k++) {
                System.out.print("* ");
            }
            numberOfSpaces++;
            numberOfStars -= 2;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        diamond(4);
    }
}
