package Recursion;

public class PreInPost {
    public static void pip(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("Pre " + n + " ");  // Pre
        pip(n - 1);
        System.out.print("In " + n + " ");   // In
        pip(n - 1);
        System.out.print("Post " + n + " "); // Post
    }

    public static void main(String[] args) {
        pip(3);
    }
}