package PatternPrinting;

public class Triangle2 {
    //    Floyd's triangle
    public static void floydsTriangle(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    //    binary triangle
    public static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    //    odd number triangle
    public static void oddNumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }

    //    another version of odd number triangle
    public static void oddNumTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2 * j - 1 + " ");
            }
            System.out.println();
        }
    }

    //    vertically flipped star triangle(vft): Method 1
    public static void vft(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //    vertically flipped star triangle(vft): Method 2
//    this method is more modular and correct
    public static void vftVersion2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {    // loop for hashes of spaces
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {   // loop for stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    vertically flipped number triangle by method: 2
    //    we could not solve this pattern by the method 1, if we try it will give the wrong ans
    public static void vftNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {  // for spaces
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {   // for numbers
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    //    vertically flipped triangle of alphabets
    public static void vftAplhabets(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++){
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        floydsTriangle(5);
//        binaryTriangle(5);
//        oddNumTriangle(4);
//        oddNumTriangle2(4);
//        vft(4);
//        vftVersion2(5);
//        vftNumber(5);
        vftAplhabets(4);
    }
}
