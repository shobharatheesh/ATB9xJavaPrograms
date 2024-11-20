package Oct_JavaCourse_ATB9X.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    public static void main(String[] args) {
        //iterate over an ArrayList using Iterator

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits);
        System.out.println("Size: "+fruits.size());

        //get the iterator
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Fruits using Iterator: ");

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }

}


