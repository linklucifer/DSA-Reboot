package PatternPrinting;

public class StartTriangle {
    public static void starTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle2(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

//    printing the triangle of alphabets
    public static void alphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void alphabetTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

//    mix triangle (numbers and alphabets)
    public static void mixTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (i % 2 != 0){
                    System.out.print(j + " ");
                }

                else {
                    System.out.print((char) (j + 64) + " ");
                }
            }
            System.out.println();
        }
    }

//    Horizontally flipped triangle(HFT)
    public static void horizontallyFlippedTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

//    second version of same code: the best and easy to understand one
    public static void secondVersion(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + 1 - i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

//    another method
    public static void thirdVersion(int n){
        int a = n;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + 1 - i; j++){
                System.out.print("*" +  " ");
            }
            a--;
            System.out.println();
        }
    }

//    HFT with numbers
    public static void hftNumbers(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + 1 - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void hftNumbers2(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + 1 - i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

//    hft with alphabets
    public static void hftAlphabets(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + 1 - i; j++){
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void hftAlphabets2(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n + 1 - i; j++){
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        starTriangle(5);
//        numberTriangle(5);
//        numberTriangle2(5);
//        alphabetTriangle(5);
//        alphabetTriangle2(5);
//        mixTriangle(5);


//        horizontally flipped triangle
//        horizontallyFlippedTriangle(5);
//        secondVersion(5);
//        thirdVersion(5);
        hftNumbers(5);
//        hftNumbers2(5);
//        hftAlphabets(5);
//        hftAlphabets2(5);
    }
}
