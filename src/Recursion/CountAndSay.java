package Recursion;

public class CountAndSay {
    public static String countSay(int n) {
        if (n == 0) {
            return "1";
        }
        String s = countSay(n - 1);
        String ans = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int freq = j - i;
                ans = ans + freq;
                ans = ans + s.charAt(i);
                i = j;
            }
        }
        int freq = j - i;
        ans = ans + freq;
        ans = ans + s.charAt(i);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSay(4));
    }
}
