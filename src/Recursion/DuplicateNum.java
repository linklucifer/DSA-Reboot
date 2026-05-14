package Recursion;

public class DuplicateNum {
    public static int duplicate(int[] arr){
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++){
            sum2 = sum + arr[i];
        }
        return sum2 - sum;
    }

//    using cyclic sort
    public static int duplicateNum(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i < n){
            if(arr[i] == i) i++;
            else {
                int idx = arr[i];
                swap(arr, idx, i);
                if (idx == i){
                    return arr[i];
                }
            }

        }
        return n;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 6, 4, 3};
//        int ans = duplicate(arr);
//        System.out.println(ans);

        int ans = duplicateNum(arr);
        System.out.println(ans);
    }
}
