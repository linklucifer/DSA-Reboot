package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static ArrayList<Integer> common(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < a.length && j < b.length){
            if (a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] a = {3, 1, 2, 1, 1, 4, 5, 5};
        int[] b = {6, 1, 1, 4, 4, 2, 8};
        System.out.println(common(a, b));
    }
}
