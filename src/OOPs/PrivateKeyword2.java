package OOPs;

// in last file(PrivateKeyword) we implement private keyword on data types, now we apply it on the methods

class Students {
    String name;
    double cgpa;
    private int rno = 1002;

//    now what if the method is private? So we cannot access this method outside this scope. To tackle this we use a public method
    private void print() {
        System.out.println(name + " " + cgpa + " " + rno);
    }

//    now that private method will be access in the main outside of this scope
    public void newPrint(){
        print();
    }
}


public class PrivateKeyword2 {
    public static void main(String[] args) {
        Students s1 = new Students();
//        s1.print();  // due to private access modifier on this method we could not access it here.
        s1.name = "Aditya";
        s1.cgpa = 9.56;
        s1.newPrint();
    }
}
