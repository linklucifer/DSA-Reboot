package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
    public static void printSubset(String ans, String s, int idx, List<String> list){
        if (idx == s.length()){
            if (ans.length() != 0)  list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        printSubset(ans + ch, s, idx + 1, list);      // pick
        printSubset(ans, s, idx + 1, list);               // skip part
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        printSubset("", s, 0, list);
        System.out.println(list);
    }
}
