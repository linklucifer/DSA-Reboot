package Recursion;

public class Global {
    static int x = 10;
    public static void fun(){
        x = 20;
    }
    public static void main(String[] args) {
//        fun();
        x = 9;
        System.out.println(x);
        int x = 4;
        System.out.println(x);
        x = 6;
    }
}
