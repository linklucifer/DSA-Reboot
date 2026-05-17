package OOPs;

/* Private Keyword is an access modifier. Private keyword restricts the access of a particular method or class or data type.
   It decides which class or method access from whom and where  */

class Student {
    String name;  // default value: null but we can also set its default values like this name = "Aditya"
    private int rno = 1002;  // default value: 0
    double cgpa;      // default value: 0.0

//    that does not mean we cannot access the private things. We can but in its respective scopes. Like we do here
    void print(){
        System.out.println(name + " " + cgpa + " " + rno);
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
//        if we try to print the name or anything without passing its values then it will print its default values
        System.out.println(s1.name);
        s1.name = "Aditya";
        s1.cgpa = 9.56;
//        s1.rno = 12;  // so here we can't access the rno, because the data type is private and outside of parent class

        s1.print();  // and if we see the output we find that the roll no of private data type is now printed
    }
}
