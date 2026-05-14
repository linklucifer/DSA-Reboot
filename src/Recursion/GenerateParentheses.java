package Recursion;

import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
//    need 5 variables to maintain the calls
    public static void generate(int n, int l, int r, String s, List<String> ans){
        if (r == n){
            ans.add(s);
            return;
        }
//        add left bracket in the string
        if (l < n){
            generate(n, l + 1, r, s + "(", ans);
        }
//        add right bracket in the string
        if (r < l){
            generate(n, l, r + 1, s + ")", ans);
        }
    }

    public static List<String> generateParentheses(int n){
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        System.out.println(generateParentheses(3));
    }
}
