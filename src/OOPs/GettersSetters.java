package OOPs;

// we use getter and setter for private attributes

// and this entire process Details class called encapsulation where we encapsulate the details of a student in a single class
class Details {
    String name;
    private int rno;
    double cgpa;

    void print() {
        System.out.println(name + " " + rno + " " + cgpa);
    }

    //    getter: Which gives us the private value
    int getRno() {
        return rno;
    }

    //    setter: Which helps us to set the value outside the scope
    void setRno(int x) {
        rno = x;
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        Details d = new Details();
        d.cgpa = 9.56;
        d.name = "Aditya";
//        d.rn0 = 10506  // we can't set the rno this way. So we use setter to set the rno
        d.setRno(10506);  // here the value 10506 set in the setter and setter pass set the value in the private attribute
        System.out.println(d.getRno());
    }
}
