package Recursion;

public class TowerOfHanoi {
    public static void hanoi(int n, char src,char helper, char dest){
        if (n == 0){
            return;
        }
//        n - 1 disks from A to B via C
        hanoi(n - 1, src, dest, helper);

//        largest from A to C
        System.out.println(src + "-> " + dest);

//        n - 1 disks from B to C via A
        hanoi(n - 1, helper, src, dest);
    }


    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }
}
