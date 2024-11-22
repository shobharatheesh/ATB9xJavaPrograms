package Oct_JavaCourse_ATB9X.DSA_Automation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RealExampleHashMap {

    public static void main(String[] args)
    {
        Map<String, Object> student1 = new HashMap<>();  //datatype fixed hashmap

        student1.put("name","shobha");
        student1.put("phone","3456789");
        student1.put("address","Bangalore");

        Set book_read_items = new HashSet();  //generic hashset

        book_read_items.add("Rich dad poor dad");
        book_read_items.add("sapiens");
        book_read_items.add("secret");
        book_read_items.add("Atomic habit");
        book_read_items.add("Atomic habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);










    }
}
