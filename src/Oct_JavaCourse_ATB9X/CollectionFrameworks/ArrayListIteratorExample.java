package Oct_JavaCourse_ATB9X.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Get the iterator
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Fruits using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
