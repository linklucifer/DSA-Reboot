package OOPs;

import java.util.Arrays;

public class Constructors3 {
    public static class StudentData {
        String name;
        int rno;
        int size;
        int[] marks;

//        constructor can also useful in setting the size of array
        StudentData(int s){
            marks = new int[s];
        }

//        a constructor can receive anything
        StudentData(int[] s){
            marks = Arrays.copyOf(s, s.length);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 4, 8};
        StudentData s1 = new StudentData(4);  // it will store the marks of 4 subjects
        StudentData s2 = new StudentData(2);

        s1.marks[0] = 89;
        s1.marks[1] = 95;
        s1.marks[2] = 59;
        s1.marks[3] = 75;

        StudentData s3 = new StudentData(arr);  // here we pass an entire array
        s3.marks[0] = 40;   // it cannot change the value of index 0 because of deep copy of the array
        System.out.println(arr[0]);
    }
}
