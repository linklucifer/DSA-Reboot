package Recursion;

public class UniquePaths {
    public static int uPaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return uPaths(m - 1, n) + uPaths(m, n - 1);
    }

//    another way
    public static int paths(int cr, int cc, int lr, int lc){
        if (cr == lr && cc == lc){
            return 1;
        }
        if (cr > lr || cc > lc){
            return 0;
        }
        int right = paths(cr, cc + 1, lr, lc);
        int down = paths(cr + 1, cc, lr, lc);
        return right + down;
    }

    public static int uniquePaths(int m, int n){
        return paths(0, 0, m - 1, n - 1);
    }

//    another way
    public static int paths2(int m, int n){
        if (m == 1 && n == 1){
            return 1;
        }
        if(m == 0 || n == 0){
            return 0;
        }
        return paths2(m, n - 1) + paths2(m - 1, n);
    }

    public static void main(String[] args) {
        System.out.println(uPaths(3, 3));

//        another way
        System.out.println(uniquePaths(3, 3));
        System.out.println(paths2(3, 3));
    }
}
