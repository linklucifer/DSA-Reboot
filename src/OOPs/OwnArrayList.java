package OOPs;

// here we are creating our own Data-Structure.
class Arraylist {  // user defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;

    Arraylist(int capacity) {
        arr = new int[capacity];
    }

//    adding element in our data structure from the end
    void add(int ele) {
        if (idx == arr.length) {  // array is full, and now it will throw index out of bound error
            capacityIncrease();
        }
        arr[idx++] = ele;
        size++;
    }

//    removing elements from the end
    void removeFromEnd(){
        idx--;
        size--;
    }

    void capacityIncrease() {
        int[] arr2 = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++){  // copy-paste all the previous elements of this array
            arr2[i] = arr[i];
        }
//        now array is no more the original thing. It is pointing to a new thing
        arr = arr2;
    }

    int capacity() {
        return arr.length;
    }

    int get(int index) {
        return arr[index];
    }

    void set(int index, int val){
        arr[index] = val;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(3);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();
        System.out.println(arr.get(1));
        arr.add(12);
        arr.display();
        arr.removeFromEnd();
        arr.display();
    }
}
