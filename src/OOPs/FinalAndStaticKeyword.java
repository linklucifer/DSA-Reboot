package OOPs;

// it is advisable that when we use final keyword in a variable we use static too

class Cricketer {
    final String country = "India";  // further the value of Country can't be changed, and it is fixed for all the cricketers

//    static means sharable. Means it is a common variable for all and can be changed
    static String venueCountry = "NZ";
    int runs;
    String name;
    double avg;
}

public class FinalAndStaticKeyword {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        System.out.println(c1.country);

//        c1.country = "England";  // we can't do it because the country value is final and fixed
        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);

//        static keyword
        c1.venueCountry = "Japan";
        System.out.println(c2.venueCountry);
    }
}


/*
    | Feature           | `final`                                       | `static`                      |
| ----------------- | --------------------------------------------- | ----------------------------- |
| Meaning           | Cannot change                                 | Shared by all objects         |
| Purpose           | Make constant/fixed                           | Save common/shared data       |
| Memory            | Separate for each object (unless also static) | Only one copy in class memory |
| Can value change? | No                                            | Yes                           |
| Related to        | Restriction                                   | Sharing                       |
| Example           | `final double PI = 3.14;`                     | `static int count;`           |

*/