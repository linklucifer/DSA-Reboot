package Recursion;

import java.util.List;
import java.util.ArrayList;

public class PowerSet {
    public static void powerSet(String ans, String s, int idx, List<String> list) {
        if (idx == s.length()) {
            if (ans.length() != 0) {
                list.add(ans);
            }
            return;
        }
        char ch = s.charAt(idx);
        powerSet(ans + ch, s, idx + 1, list);    // pick
        powerSet(ans, s, idx + 1, list);              // skip
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<>();
        powerSet("", s, 0, ans);
        System.out.println(ans);
    }
}
