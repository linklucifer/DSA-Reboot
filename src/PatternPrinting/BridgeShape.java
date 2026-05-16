package PatternPrinting;

public class BridgeShape {
    public static void bridge(int n) {
        int numberOfSpaces = 1;
//       now the last part of bridge i.e. the first line of bridge that we ignored in the starting
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

//        as of now ignore the first line of bridge, we will print it later. So the line we are printing is n - 1
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {   // each time stars are reducing by 1 so we print the stars till i
                System.out.print("* ");
            }

            for (int k = 1; k <= numberOfSpaces; k++) {  // now the spaces are increasing by 1
                System.out.print("  ");
            }

//            printing the stars for the second line onwards. Refer the pattern of bridge mentioned below
            for (int l = 1; l <= n - i; l++) {
                System.out.print("* ");
            }

//           now as per the observation of bridge as we move forward we can conclude that spaces are increases by 2
            numberOfSpaces += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        bridge(4);
    }
}



/*

 * * * * * * * * *
 * * * *   * * * *
 * * *       * * *
 * *           * *
 *               *

 */
