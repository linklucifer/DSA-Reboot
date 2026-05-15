package PatternPrinting;

public class Triangle2 {
//    Floyd's triangle
    public static void floydsTriangle(int n){
        int a = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

//    binary triangle
    public static void binaryTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0){
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

//    odd number triangle
    public static void oddNumTriangle(int n){
        for (int i = 1; i <= n; i++){
            int a = 1;
            for (int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
//        floydsTriangle(5);
//        binaryTriangle(5);
        oddNumTriangle(4);
    }
}
