package OOPs;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student {     // it is our own(user defined data type) we can create as many as we want
        String name;
        int rno;
        Double cgpa;

        void print() {
            System.out.println(name + " " + rno + " " + cgpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();   // declaration
        s1.name = "Aditya";
        s1.rno = 22131;
        s1.cgpa = 9.56;

        Student s2 = new Student();   // declaration
        s2.name = "Sony";
        s2.rno = 10012;
        s2.cgpa = 8.30;

        Student s3 = new Student();   // declaration
        s3.name = "Anushka";
//        if we want we can take the input as well
//        System.out.print("Enter the roll no of s3 ");
//        s3.rno = sc.nextInt();
        s3.rno = 10500;
        s3.cgpa = 8.20;

        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);

//        we can update the cgpa
        s3.cgpa = 8.30;
        System.out.println(s3.name + " " + s3.rno + " " + s3.cgpa);

//        instead of this much of lines for print, we simply do this
        s1.print();
        s2.print();
        s3.print();
    }
}
