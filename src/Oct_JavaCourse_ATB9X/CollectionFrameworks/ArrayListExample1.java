package Oct_JavaCourse_ATB9X.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String[] args)
    {
       List list = new ArrayList<>();

        list.add("bread"); // 0
        list.add("milk");  // 1
        list.add("butter"); // 2
        list.add("paneer");  //3
        list.add("jam");  //4
        list.add("cheese");  //5
        list.add(123);  //6
        list.add(true);  //5

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));

        System.out.println("Default for loop ...............");

        for(int  i= 0 ; i < list.size();i++)
        {
            System.out.println(list.get(i)); //to get the items we use get() method
        }

        System.out.println("Arraylist:" +list); // print the array elements


        System.out.println("Using Iterator ...............");

         Iterator iterator = list.iterator();

         while(iterator.hasNext())

         {
             System.out.println(iterator.next());
         }



    }
}
