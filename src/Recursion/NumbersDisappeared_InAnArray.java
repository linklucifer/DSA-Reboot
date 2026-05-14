package Recursion;

import java.util.ArrayList;

public class NumbersDisappeared_InAnArray {
    public static ArrayList<Integer> disappeared(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < n){
            int rightIdx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[rightIdx] == arr[i]){
                i++;
            }

            else {
                swap(arr, rightIdx, i);
            }
        }
        for (i = 0; i < n; i++){
            if (arr[i] != 0){
                ans.add(i + 1);
            }
        }
        return ans;
    }

//    swap
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        int[] arr = {4, 4, 4, 4, 4};
        ArrayList<Integer> res = disappeared(arr);
        System.out.println(res);
    }
}
