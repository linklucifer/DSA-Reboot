import java.util.ArrayList;

public class MoreInStrings {
    public static void change(String name) {
        name = "Aditya";
    }

    private static void change2(ArrayList<String> list) {
        list.add("Shravani");
        list.add("Shelly");
        list.add("Klassen");
    }

    public static void main(String[] args) {
        String name = "Anushka";
        change(name);
        System.out.println(name);

        String[] arr = {"Aditya", "Anushka", "Smriti", "Ashish", "Anish"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("Aditya");
        list.add("Anushka");
        list.add("Smriti");
        list.add("Ashish");
        list.add("Anish");
        list.add("Satyam");
        list.add("Anamika");
        System.out.println(list);

//      it will add extra strings from the chnage2 method, and modify the original arrayList because it is a pass by reference, not string
        change2(list);
        System.out.println(list);
    }
}
